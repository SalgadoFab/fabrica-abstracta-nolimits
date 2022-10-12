package jframe;
import producto_Abstracto.Component;

import javax.swing.*;
import java.awt.*;

public class Frame {

    private JPanel panel;
    private JFrame frame;

    public Frame(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("Fabrica de Componentes");
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel, BorderLayout.CENTER);
    }

    public JPanel getPanel(){
        return this.panel;
    }


    public void launch () {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setVisible(true);
            }
        });
    }
}


