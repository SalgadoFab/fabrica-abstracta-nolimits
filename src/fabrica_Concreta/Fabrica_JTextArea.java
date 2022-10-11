package fabrica_Concreta;

import fabrica_Abstracta.SwingComponent;
import producto_Abstracto.Component;
import producto_Concreto.Producto_JTextArea;

public class Fabrica_JTextArea implements SwingComponent {

    @Override
    public Component crearComponente() {
        Producto_JTextArea textArea = new Producto_JTextArea();
        textArea.setIdentificador(textArea.generarIdentificador());
        return textArea;
    }
}
