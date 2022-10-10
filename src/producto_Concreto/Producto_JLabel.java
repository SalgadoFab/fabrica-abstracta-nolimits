package producto_Concreto;
import producto_Abstracto.Component;
import javax.swing.*;
import java.awt.*;


//Producto Concreto
public class Producto_JLabel implements Component {

	private JLabel label = new JLabel();

	private static final String tipo = "JLabel";
	private int identificador;

	public void setIdentificador(int identificador) {
		this.identificador = 200000 + identificador;
	}

	public int generarIdentificador () {return (int) (Math.random() * 9999);}

	@Override
	public void agregarTexto(String pTexto) {
		this.label.setText("test");
	}

	@Override
	public void agregarDimensiones(int pX, int pY, int pLargo, int pAlto) {
		this.label.setMinimumSize(new Dimension(pLargo, pAlto));
		this.label.setPreferredSize(new Dimension(pLargo, pAlto));
		this.label.setMaximumSize(new Dimension(pLargo, pAlto));

		this.label.setAlignmentX(pX);
		this.label.setAlignmentY(pY);
	}

	@Override
	public void esVisible(boolean pEstado) {
		this.label.setVisible(pEstado);
	}

	@Override
	public void agregarTextoAyuda(String pTexto) {
		this.label.setToolTipText(pTexto);
	}

	@Override
	public void agregarEnContenedor(JFrame pFrame) {
		pFrame.add(this.label);
	}

	@Override
	public String obtenerTexto() {
		return this.label.getText();
	}

	@Override
	public JComponent obtenerComponente() {
		return this.label;
	}

	@Override
	public String tipo() {
		return this.tipo;
	}

	@Override
	public int identificador() {
		return this.identificador;
	}
}
