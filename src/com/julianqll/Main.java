package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el importe que aporta Carmela:");
        double importeCarmela = sc.nextDouble();
        System.out.println("Digite el importe que aporta Javier:");
        double importeJavier = sc.nextDouble();
        System.out.println("Digite el importe que aporta Eulogio:");
        double importeEulogio = sc.nextDouble();
        double capital = importeCarmela + importeJavier + importeEulogio;
        double porcentajeCarmela = (importeCarmela/capital) * 100;
        double porcentajeJavier = (importeJavier/capital) * 100;
        double porcentajeEulogio = (importeEulogio/capital) * 100;
        System.out.println("El capital formado es: " + capital);
        System.out.println("El porcentaje del capital de Carmela es: " + porcentajeCarmela +"% \n" +
                            "El porcentaje del capital de Javier es: " + porcentajeJavier +"% \n" +
                            "El porcentaje del capital de Eulogio es: " + porcentajeEulogio +"% \n");
    }
}