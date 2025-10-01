package org.example;

import javax.swing.*;

public class exemplo_calendario {
    public static void main (String args[]) {
        String strMes;
        int intMes;

        strMes = JOptionPane.showInputDialog("Digite o número do mês de (1 a 12)");
        intMes = Integer.parseInt(strMes);
        switch (intMes) {
            case 1: strMes = "Janeiro";
            break;
            case 2: strMes = "Fevereiro";
            break;
            case 3: strMes = "Março";
            break;
            case 4: strMes = "Abril";
            break;
            case 5: strMes = "Maio";
            break;
            case 6: strMes = "Junho";
            break;
            case 7: strMes = "Julho";
            break;
            case 8: strMes = "Agosto";
            break;
            case 9: strMes = "Setembro";
            break;
            case 10: strMes = "Outubro";
            break;
            case 11: strMes = "Novembro";
            break;
            case 12: strMes = "Dezembro";
        }
        JOptionPane.showMessageDialog(null,"O mês é: "+strMes,"Informação",JOptionPane.INFORMATION_MESSAGE);
    }
}
