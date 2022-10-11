package gestor;

import fabrica_Abstracta.SwingComponent;
import fabrica_Concreta.Fabrica_JButton;
import producto_Abstracto.Component;
import producto_Concreto.Producto_JButton;

import javax.swing.*;
import java.util.ArrayList;

public class Fabrica_SwingComponent {
    private static ArrayList<Component> arComponents = new ArrayList<Component>();
    public static String CrearFabricaDeComponentes(SwingComponent fabrica) {
        Component objComponentes = fabrica.crearComponente();
        agregar_Componente(objComponentes);
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

        switch (opcion) {

            case 1:
                SwingComponent sComponent = new SwingComponent() {
                    @Override
                    public Component crearComponente() {
                        Producto_JButton JButton = new Producto_JButton();
                        JButton.agregarTexto("Prueba siu");
                        return JButton;
                    }
                };
                sMensaje = CrearFabricaDeComponentes(sComponent);
                break;
//
//            case 2:
//                sComponent = new Fabrica_Bus();
//                sMensaje = CrearFabricaDeVehiculos(moVeh);
//                break;
//
//            case 3:
//                sComponent = new Fabrica_Microbus();
//                sMensaje = CrearFabricaDeVehiculos(moVeh);
//                break;
//
//            case 4:
////                sComponent = new Fabrica_Microbus();
////                sMensaje = CrearFabricaDeVehiculos(moVeh);
//                break;
//
//            case 5:
//                sMensaje = obtener_informacion_tranportes();
//                break;

            case 6:
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