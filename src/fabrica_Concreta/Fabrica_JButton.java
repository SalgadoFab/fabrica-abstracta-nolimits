package fabrica_Concreta;

import producto_Abstracto.Component;
import producto_Concreto.Producto_JButton;

import javax.swing.*;

public class Fabrica_JButton {


    public Component crearComponente() {
       Producto_JButton button = new Producto_JButton();

        button.agregarTexto("Botón");
        button.setIdentificador(button.generarIdentificador());
        button.agregarEnContenedor(new JFrame());
        button.esVisible(true);
        button.agregarDimensiones(500,800,20,20);

        return  button;
    }
}
