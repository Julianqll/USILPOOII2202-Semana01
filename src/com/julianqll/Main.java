package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la medida del lado A:");
        double a = sc.nextDouble();
        System.out.println("Digite la medida del lado B:");
        double b = sc.nextDouble();
        System.out.println("Digite la medida del lado C:");
        double c = sc.nextDouble();
        double area = (((a-c)*b)/2) + c*b;
        System.out.println("El area del terreno con las medidas ingresada es: " + area);
    }
}