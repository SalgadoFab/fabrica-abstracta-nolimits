package producto_Concreto;

import producto_Abstracto.Component;

import javax.swing.*;

public class Producto_JChexbox implements Component {

    private JCheckBox checkBox = new JCheckBox();
    private static final String tipo = "JCheckBox";
    private int identificador;

    public void setIdentificador(int identificador) {
        this.identificador = 200000 + identificador;
    }


    @Override
    public void agregarTexto(String pTexto) {

    }

    @Override
    public void agregarDimensiones(int pX, int pY, int pLargo, int pAlto) {

    }

    @Override
    public void esVisible(boolean pEstado) {

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
