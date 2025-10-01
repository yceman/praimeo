package org.example;

import javax.swing.*;
import java.awt.*;

public class LinhaEntrePontos extends JFrame {
    public LinhaEntrePontos() {
        setTitle("Linha entre dois pontos");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DesenhoPanel());
    }

    class DesenhoPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            //Definir os pontos:
            int x1 = 50, y1 = 50;
            int x2 = 300, y2 = 300;
            int x3 = 300, y3 = 50;

            //Desenhar os pontos:
            g.fillOval(x1 - 5, y1 - 5, 10, 10);
            g.fillOval(x2 - 5, y2 - 5, 10, 10);
            g.fillOval(x3 - 5, y3 - 5, 10, 10);

            //Desenhar a linha entre os pontos:
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3,y3);
            g.drawLine(x1, y1, x3, y3);
        }
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            LinhaEntrePontos frame = new LinhaEntrePontos();
            frame.setVisible(true);
        });
    }
}
