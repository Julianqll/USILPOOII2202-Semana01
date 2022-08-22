package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el precio de compra de la pieza:");
        double precioCompra = sc.nextDouble();
        System.out.println("Digite el porcentaje de ganancia que desea tener(%):");
        double porcentajeGanancia = sc.nextDouble();
        double precioVenta = precioCompra * (100+porcentajeGanancia)/100;
        System.out.println("El precio al que debe vender la pieza para obtener la ganancia deseada es: " + precioVenta);
    }
}