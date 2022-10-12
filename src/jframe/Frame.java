package jframe;
import javax.swing.*;

public class Frame {

    private JFrame frame;

    public Frame(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("Fabrica de Componentes");
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
    }

    public JFrame getPanel(){
        return this.frame;
    }

    public void show(){
        this.frame.setVisible(true);
    }
}


