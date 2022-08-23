package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un entero de 3 cifras:");
        int enteroTresCifras = sc.nextInt();
        int enteroTresCifrasCopia = enteroTresCifras;
        int enteroTresCifrasInvertido = 0;
        boolean mascifras = false;
        int i = 2;
        while (i >= 0)
        {
            int cifra = enteroTresCifras % 10;
            enteroTresCifras /= 10;
            if ((i == 0 && enteroTresCifras > 0) || (i > 0 && enteroTresCifras == 0))
            {
                mascifras = true;
                break;
            }
            enteroTresCifrasInvertido += cifra * Math.pow(10,i);
            i--;
        }
        if (mascifras)
        {
            System.out.println("Número incorrecto");
        }
        else
        {
            if (enteroTresCifrasCopia == enteroTresCifrasInvertido)
            {
                System.out.println("Es numero capicua");
            }
            else
            {
                System.out.println("No es numero capicua");
            }
        }
    }
}