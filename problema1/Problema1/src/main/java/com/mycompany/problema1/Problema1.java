/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema1;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioKw;
        double mesKw;
        double valorplanilla;
        int edad;
        int referencia = 65;
        double total;
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el costo kilovatio hora:");
        precioKw = entrada.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos en el mes:");
        mesKw = entrada.nextDouble();

        valorplanilla = precioKw * mesKw;

        if (edad > referencia) {
            total = (valorplanilla * 10) / 100;
            valorplanilla = valorplanilla - total;
        }

        System.out.printf("El valor a cancelar es "
                + "de:%2s", valorplanilla);
    }
}
