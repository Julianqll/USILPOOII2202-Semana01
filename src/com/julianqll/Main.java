package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el número total de horas trabajadas:");
        double horasTrabajadas = sc.nextDouble();
        System.out.println("Digite la tarifa horaria:");
        double tarifaHoraria = sc.nextDouble();
        double sueldoBasico = horasTrabajadas * tarifaHoraria;
        double sueldoBruto = sueldoBasico * 1.18;
        double sueldoNeto = sueldoBruto * 0.88;
        System.out.println("El sueldo básico del empleado es: " + sueldoBasico);
        System.out.println("El sueldo bruto del empleado es: " + sueldoBruto);
        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}