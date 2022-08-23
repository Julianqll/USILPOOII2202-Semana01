package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la nota final del curso:");
        double notaFinal = sc.nextDouble();
        if (notaFinal < 12.50 && notaFinal >= 0)
        {
            System.out.println("Estado del alumno: DESAPROBADO");
        }
        else if (notaFinal >= 12.5 && notaFinal <= 20)
        {
            System.out.println("Estado del alumno: APROBADO");
        }
        else
        {
            System.out.println("Error: No existe estado del alumno");

        }
    }
}