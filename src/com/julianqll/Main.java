package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un entero positivo entre 1 y 100:");
        int enteroPositivo = sc.nextInt();
        if (enteroPositivo >= 1 && enteroPositivo <= 100)
        {
            int counter = 0;
            for (; enteroPositivo > 0 ; enteroPositivo /= 10)
            {
                counter++;
            }
            if (counter == 1)
            {
                System.out.println("El numero tiene 1 digito");
            }
            else
            {
                System.out.println("El numero tiene " + counter + " digitos");
            }
        }
        else
        {
            System.out.println("Numero incorrecto");
        }
    }
}