package producto_Abstracto;
//Interfaz Abstracta Objetos Concretos
//Producto Abstracto

import javax.swing.*;

public interface Component {
	public void agregarTexto(String pTexto);
	public void agregarDimensiones(int pX, int pY, int pLargo, int pAlto);
	public void esVisible(boolean pEstado);
	public void agregarTextoAyuda(String pTexto);
	public void agregarEnContenedor(JFrame pFrame);
	public String obtenerTexto();
	public JComponent obtenerComponente();
	public String tipo();
	public int identificador();
}
