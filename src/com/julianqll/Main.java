package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la distancia entre ciudades:");
        double distancia = sc.nextDouble();
        System.out.println("Digite la velocidad que tiene la bicicleta:");
        double velocidad = sc.nextDouble();
        double tiempo = distancia / velocidad;
        System.out.println("El tiempo que tarda la persona es: " + tiempo);
    }
}