package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la hipotenusa(H) de la figura:");
        double hipotenusa = sc.nextDouble();
        System.out.println("Digite el radio(R) de la figura:");
        double radio = sc.nextDouble();
        double altura = Math.sqrt(Math.pow(hipotenusa,2) - Math.pow(radio,2)) ;
        double areaTriangulo = (radio * altura) / 2;
        double areaSemicircunferencia = (Math.PI * Math.pow(radio,2))/2;
        double areaFormaA = (areaTriangulo * 2) + areaSemicircunferencia;
        System.out.println("El area de la forma A es: " + areaFormaA);
    }
}