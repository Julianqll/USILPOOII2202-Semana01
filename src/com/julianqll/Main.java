package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el número total de horas trabajadas:");
        double horasTrabajadas = sc.nextDouble();
        System.out.println("Digite la tarifa horaria:");
        double tarifaHoraria = sc.nextDouble();
        double sueldoBruto = horasTrabajadas * tarifaHoraria;
        double descuentoESSALUD = sueldoBruto * 0.09;
        double descuentoAFP = sueldoBruto * 0.115;
        double sueldoNeto = sueldoBruto - (descuentoESSALUD + descuentoAFP);
        System.out.println("El sueldo bruto del empleado es: " + sueldoBruto);
        System.out.println("El descuento por ESSALUD es: " + descuentoESSALUD);
        System.out.println("El descuento por AFP es: " + descuentoAFP);
        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}