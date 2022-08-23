package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el consumo en GB:");
        double consumo = sc.nextDouble();
        double pagoMes;
        if (consumo <= 4 && consumo >= 0)
        {
            pagoMes = 50;
        }
        else
        {
            pagoMes = 85;
            if (consumo > 8)
            {
                double consumoAdicional = consumo - 8;
                double pagoMesAdicional = consumoAdicional * 4.50;
                pagoMes += pagoMesAdicional;
            }
        }
        System.out.println("El recibo de consumo es: " + pagoMes);
    }
}