package fabrica_Concreta;

import fabrica_Abstracta.SwingComponent;
import producto_Abstracto.Component;
import producto_Concreto.Producto_JLabel;

//Fabrica Concreta

public class Fabrica_JLabel implements SwingComponent {


	@Override
	public Component crearComponente() {
		Producto_JLabel label = new Producto_JLabel();

		label.setIdentificador(label.generarIdentificador());
		return label;
	}
}