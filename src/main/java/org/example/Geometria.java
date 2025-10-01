package org.example;

import javax.swing.*;
import java.awt.*;

public class Geometria extends JFrame {
    public Geometria() {
        setTitle("Plano Descritivo");
        setSize(1200,820);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Geometria.DesenhoPlano());
    }
    class DesenhoPlano extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            //Definir os pontos no Diedro
            int x1 = 50, y1 = 50;
            int x2 = 300, y2 = 300;

            //Desenhar os pontos
            g.fillOval(x1 - 5, y1 - 5, 10, 10);
            g.fillOval(x2 - 5, y2 - 5, 10, 10);

            //Desenhar a linha entre os pontos
            //g.drawLine(x1, y1, x2, y2);
            g.drawLine(x1, y1, x2, y2);
        }
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Geometria frame = new Geometria();
            frame.setVisible(true);
        });
    }
}
