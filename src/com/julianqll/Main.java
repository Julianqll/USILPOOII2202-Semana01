package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la altura de la piscina: ");
        double altura = sc.nextDouble();
        System.out.println("Digite la anchura de la piscina: ");
        double anchura = sc.nextDouble();
        System.out.println("Digite el largo de la piscina: ");
        double largo = sc.nextDouble();
        System.out.println("Digite el precio por metro cúbico de agua: ");
        double precio = sc.nextDouble();
        double volumen = altura * anchura * largo;
        double pago = volumen * precio;
        System.out.println("El pago que se debe realizar por el total de m3 que consume de agua al llenar la piscina es: " + pago);
    }
}