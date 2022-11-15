/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema4;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias;
        double precio;
        double total;
        double totalDescuento;
        double total2;

        System.out.println("Ingrese el numero de dias:");
        dias = entrada.nextInt();
        System.out.println("Ingrese el costo de la habitación:");
        precio = entrada.nextDouble();
        total = dias * precio;
        if (dias > 5 && dias <= 10) {
            totalDescuento = (total * 10) / 100 - total - 1;
            System.out.printf("""
                              El valor a pagar es de:%2s
                               El valor con descuento es de:%s
                              """, total, totalDescuento);
        }
        if (dias > 10 && dias <= 15) {
            totalDescuento = (total * 10) / 100 - total - 1;
            System.out.printf("""
                              El valor a pagar es de:%2s
                               El valor con descuento es de:%s
                              """, total, totalDescuento);
        }
        if (dias > 15) {
            totalDescuento = (total * 10) / 100 - total * -1;
            System.out.printf("""
                              El valor a pagar es de:%2s
                               El valor con descuento es de:%s
                              """, total, totalDescuento);
        }
        if (dias <= 5) {
            System.out.printf("""
                              El valor a pagar es de:%2s
                               El valor con descuento es de: No hay descuento 
                              aplicable gracias por su estadia.""", total);
        }

    }
}
