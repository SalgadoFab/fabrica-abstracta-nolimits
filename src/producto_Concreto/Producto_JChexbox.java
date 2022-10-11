package producto_Concreto;

import producto_Abstracto.Component;

import javax.swing.*;
import java.awt.*;

public class Producto_JChexbox implements Component {

    private JCheckBox checkBox = new JCheckBox();
    private static final String tipo = "JCheckBox";
    private int identificador;

    public void setIdentificador(int identificador) {
        this.identificador = 200000 + identificador;
    }

    public int generarIdentificador() {
        return (int) (Math.random() * 9999);
    }

    @Override
    public void agregarTexto(String pTexto) {
        checkBox.setText(pTexto);
    }

    @Override
    public void agregarDimensiones(int pX, int pY, int pLargo, int pAlto) {
        this.checkBox.setMinimumSize(new Dimension(pLargo, pAlto));
        this.checkBox.setPreferredSize(new Dimension(pLargo, pAlto));
        this.checkBox.setMaximumSize(new Dimension(pLargo, pAlto));

        this.checkBox.setAlignmentX(pX);
        this.checkBox.setAlignmentY(pY);
    }

    @Override
    public void esVisible(boolean pEstado) {
        this.checkBox.setVisible(pEstado);
    }

    @Override
    public void agregarTextoAyuda(String pTexto) {

    }

    @Override
    public void agregarEnContenedor(JFrame pFrame) {

    }

    @Override
    public String obtenerTexto() {
        return null;
    }

    @Override
    public JComponent obtenerComponente() {
        return null;
    }

    @Override
    public String tipo() {
        return null;
    }

    @Override
    public int identificador() {
        return 0;
    }
}
