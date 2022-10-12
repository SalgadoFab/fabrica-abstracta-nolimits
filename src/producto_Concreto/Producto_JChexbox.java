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
        this.checkBox.setBounds(pX, pY, pLargo, pAlto);
    }

    @Override
    public void esVisible(boolean pEstado) {
        this.checkBox.setVisible(pEstado);
    }

    @Override
    public void agregarTextoAyuda(String pTexto) {
        this.checkBox.setToolTipText(pTexto);
    }

    @Override
    public void agregarEnContenedor(JPanel pFrame) {
        pFrame.add(this.checkBox);
    }

    @Override
    public String obtenerTexto() {
        return this.checkBox.getText();
    }

    @Override
    public JComponent obtenerComponente() {
        return this.checkBox;
    }

    @Override
    public String tipo() {
        return this.tipo;
    }

    @Override
    public int identificador() {
        return identificador;
    }
}
