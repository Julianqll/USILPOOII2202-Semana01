package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el precio del producto:");
        double precioProducto = sc.nextDouble();
        System.out.println("Digite la cantidad de unidades:");
        double cantidadUnidades = sc.nextDouble();
        System.out.println("Digite el porcetanje del descuento(%) sobre la compra:");
        double porcentajeDescuento = sc.nextDouble();
        double importeCompra = precioProducto * cantidadUnidades;
        double importeDescuento = (porcentajeDescuento / 100) * importeCompra;
        double importePagar = importeCompra - importeDescuento;
        System.out.println("El importe de la compra es: " + importeCompra);
        System.out.println("El importe del descuento es: " + importeDescuento);
        System.out.println("El importe a pagar por la compra es: " + importePagar);
    }
}