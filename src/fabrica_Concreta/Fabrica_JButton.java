package fabrica_Concreta;

import fabrica_Abstracta.SwingComponent;
import producto_Abstracto.Component;
import producto_Concreto.Producto_JButton;

public class Fabrica_JButton implements SwingComponent {
    public Component crearComponente() {
       Producto_JButton button = new Producto_JButton();

        button.agregarTexto("Texto Default");
        button.setIdentificador(button.generarIdentificador());
        return  button;
    }
}
