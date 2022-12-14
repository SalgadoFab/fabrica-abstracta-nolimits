package producto_Concreto;
import producto_Abstracto.Component;
import javax.swing.*;

public class Producto_JTextArea implements Component {
    private JTextArea textArea = new JTextArea();
    private static final String tipo = "JTextArea";
    private int identificador;

    public void setIdentificador(int identificador) {
        this.identificador = 200000 + identificador;
    }

    public int generarIdentificador() {
        return (int) (Math.random() * 9999);
    }
    @Override
    public void agregarTexto(String pTexto) {
        this.textArea.setText(pTexto);
    }

    @Override
    public void agregarDimensiones(int pX, int pY, int pLargo, int pAlto) {
        this.textArea.setBounds(pX, pY, pLargo, pAlto);
    }

    @Override
    public void esVisible(boolean pEstado) {
        this.textArea.setVisible(pEstado);
    }

    @Override
    public void agregarTextoAyuda(String pTexto) {
        this.textArea.setToolTipText(pTexto);
    }

    @Override
    public void agregarEnContenedor(JPanel pFrame) {
        pFrame.add(this.textArea);
    }

    @Override
    public String obtenerTexto() {
        return this.textArea.getText();
    }

    @Override
    public JComponent obtenerComponente() {
        return this.textArea;
    }

    @Override
    public String tipo() {
        return tipo;
    }

    @Override
    public int identificador() {
        return this.identificador;
    }
}
