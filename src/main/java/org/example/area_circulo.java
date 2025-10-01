package org.example;

public class area_circulo {
    public static void main (String args[]) {
        int intRaio, intRao;
        double fltPi, fltArea;
        dimensao Circulo = new dimensao();

        Circulo.fltPi = 3.1416;
        Circulo.intRaio = 6;
        Circulo.intRao = Circulo.intRaio * Circulo.intRaio;
        fltArea = Circulo.fltPi * Circulo.intRao;

        System.out.println("A área do circulo é = "+fltArea);

    }
}
