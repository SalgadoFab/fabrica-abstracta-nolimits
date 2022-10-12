package gestor;

import fabrica_Abstracta.SwingComponent;
import fabrica_Concreta.Fabrica_JButton;
import fabrica_Concreta.Fabrica_JCheckbox;
import fabrica_Concreta.Fabrica_JTextArea;
import jframe.Frame;
import producto_Abstracto.Component;

import java.awt.*;
import java.util.ArrayList;

public class Fabrica_SwingComponent {
    private static ArrayList<Component> arComponents = new ArrayList<Component>();

    public static String CrearFabricaDeComponentes(SwingComponent fabrica) {
        Component objComponentes = fabrica.crearComponente();
        return objComponentes.tipo();
    }

    private static void agregar_Componente(Component pObjComponente) {
        arComponents.add(pObjComponente);
    }

    public static String obtener_tipo_componentes() {
        String msDatos = "";

        for (int i = 0; i < arComponents.size(); i++)
            msDatos = msDatos + arComponents.get(i).tipo() + "\n";

        return msDatos;
    }

    public Frame setComponent (Component component) {
        Frame frame = new Frame();
        component.agregarEnContenedor(frame.getPanel());

        return frame;
    }

    public void showComponent(Component component) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = setComponent(component);
                frame.show();
            }
        });
    }

    /**
     * Function:
     * Procesar Funcion
     * Descripción:
     * Según la opción seleccionada por el usuario, decide si crea una
     * fabrica u obtiene los valores de los objetos creados. En caso de
     * que la opción no este en el rango valido, envia un mensaje de error.
     *
     * @param opcion pOpc            // La opcion escogida por el usuario.
     * @return String sMensaje     // El resultado de la función escogida.
     **/
    public static String procesarFuncion(int opcion) {
        String sMensaje = "";
        SwingComponent fabrica;
        switch (opcion) {
            case 1:
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        Frame frame = new Frame();
                        frame.show();
                    }
                });
//                fabrica = new Fabrica_JLabel();
//                sMensaje = CrearFabricaDeComponentes(fabrica);
                break;
            case 2:
                fabrica = new Fabrica_JCheckbox();
                sMensaje = CrearFabricaDeComponentes(fabrica);
                break;
            case 3:
                fabrica = new Fabrica_JTextArea();
                sMensaje = CrearFabricaDeComponentes(fabrica);
                break;
            case 4:
                fabrica = new Fabrica_JButton();
                sMensaje = CrearFabricaDeComponentes(fabrica);
                break;
            case 5:
                sMensaje = "Muchas gracias por usar el sistema";
                break;
            default:
                sMensaje = "Opcion invalida";
                break;
        }
        return sMensaje;
    }

    private void parametrosComponentes() {

    }
}