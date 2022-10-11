package fabrica_Concreta;

import fabrica_Abstracta.SwingComponent;
import producto_Abstracto.Component;
import producto_Concreto.Producto_JChexbox;


public class Fabrica_JCheckbox implements SwingComponent {

    @Override
    public Component crearComponente() {
        Producto_JChexbox checkbox = new Producto_JChexbox();

        checkbox.setIdentificador(checkbox.generarIdentificador());
        return checkbox;
    }

}
