/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema3;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca;
        String origen;
        double costo;
        String origen1 = "Alemania";
        String origen2 = "Japón";
        String origen3 = "Italia";
        double total = 0;
        System.out.println("Ingrese la marca del automóvil:");
        marca = entrada.nextLine();
        System.out.println("Ingrese el lugar de origen:");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil:");
        costo = entrada.nextDouble();

        if (origen1.equals(origen)) {
            total = (costo * 20) / 100 - costo * -1;
        }
        if (origen2.equals(origen)) {
            total = (costo * 30) / 100 - costo * -1;
        }
        if (origen3.equals(origen)) {
            total = (costo * 15) / 100 - costo * -1;
        }

        System.out.printf("""
                          El precio a pagar es de:%2s
                          La marca del autom\u00f3vil es:%s""",
                total, marca);
    }
}
