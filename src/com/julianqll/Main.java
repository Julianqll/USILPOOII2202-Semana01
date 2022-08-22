package com.julianqll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la ganancia de la empresa en el año:");
        double gananciaAño = sc.nextDouble();
        System.out.println("Digite la cantidad de acciones del primer socio:");
        double accionesPrimerSocio = sc.nextDouble();
        System.out.println("Digite la cantidad de acciones del segundo socio:");
        double accionesSegundoSocio = sc.nextDouble();
        System.out.println("Digite la cantidad de acciones del tercer socio");
        double accionesTercerSocio = sc.nextDouble();
        double totalAcciones = accionesPrimerSocio + accionesSegundoSocio + accionesTercerSocio;
        double gananciaPrimerSocio = (accionesPrimerSocio/totalAcciones) * gananciaAño;
        double gananciaSegundoSocio = (accionesSegundoSocio/totalAcciones) * gananciaAño;
        double gananciaTercerSocio = (accionesTercerSocio/totalAcciones) * gananciaAño;
        System.out.println("El monto de ganancia que le corresponde al primer socio es: " + gananciaPrimerSocio +" \n" +
                            "El monto de ganancia que le corresponde al primer socio es: " + gananciaSegundoSocio +" \n" +
                            "El monto de ganancia que le corresponde al primer socio es: " + gananciaTercerSocio +" \n");
    }
}