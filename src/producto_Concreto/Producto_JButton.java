package producto_Concreto;
import producto_Abstracto.Component;
import javax.swing.*;

public class Producto_JButton implements Component {

    private JButton jButton = new JButton();
    private static final String tipo = "JButton";
    private int identificador;

    public void setIdentificador(int identificador) {
        this.identificador = 200000 + identificador;
    }

    public int generarIdentificador () {return (int) (Math.random() * 9999);}

    @Override
    public void agregarTexto(String pTexto) {
        this.jButton.setText(pTexto);
    }

    @Override
    public void agregarDimensiones(int pX, int pY, int pLargo, int pAlto) {
        this.jButton.setBounds(pX, pY, pLargo, pAlto);
    }

    @Override
    public void esVisible(boolean pEstado) {
        this.jButton.setVisible(pEstado);
    }

    @Override
    public void agregarTextoAyuda(String pTexto) {
        this.jButton.setToolTipText(pTexto);
    }

    @Override
    public void agregarEnContenedor(JPanel pFrame) {
        pFrame.add(this.jButton);
    }

    @Override
    public String obtenerTexto() {
        return this.jButton.getText();
    }

    @Override
    public JComponent obtenerComponente() {
        return this.jButton;
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

