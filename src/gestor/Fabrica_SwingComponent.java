package gestor;

import fabrica_Abstracta.SwingComponent;
import fabrica_Concreta.Fabrica_JButton;
import fabrica_Concreta.Fabrica_JCheckbox;
import fabrica_Concreta.Fabrica_JLabel;
import fabrica_Concreta.Fabrica_JTextArea;
import jframe.Frame;
import producto_Abstracto.Component;

public class Fabrica_SwingComponent {

    public static Component CrearFabricaDeComponentes(SwingComponent fabrica) {
        return fabrica.crearComponente();
    }

    public static Frame setComponent(Component component) {
        Frame frame = new Frame();

        component.agregarTexto("Texto del Componente");
        component.agregarDimensiones(250, 150, 250, 100);
        component.esVisible(true);
        component.agregarTextoAyuda("Ayuda!");
        component.agregarEnContenedor(frame.getPanel());

        System.out.println("Texto del componente: " + component.obtenerTexto());
        System.out.println("Tipo del componente: " + component.tipo());

        return frame;
    }

    public static void showComponent(Component component) {
        Frame frame = setComponent(component);
        frame.launch();
    }

    public static String procesarFuncion(int opcion) {
        String sMensaje = "Componente creado";
        Component component;
        SwingComponent fabrica;
        switch (opcion) {
            case 1 -> {
                fabrica = new Fabrica_JLabel();
                component = CrearFabricaDeComponentes(fabrica);
                showComponent(component);
            }
            case 2 -> {
                fabrica = new Fabrica_JButton();
                showComponent(CrearFabricaDeComponentes(fabrica));
            }
            case 3 -> {
                fabrica = new Fabrica_JTextArea();
                showComponent(CrearFabricaDeComponentes(fabrica));
            }
            case 4 -> {
                fabrica = new Fabrica_JCheckbox();
                showComponent(CrearFabricaDeComponentes(fabrica));
            }
            case 5 -> sMensaje = "Muchas gracias por usar el sistema";
            default -> sMensaje = "Opcion invalida";
        }
        return sMensaje;
    }
}