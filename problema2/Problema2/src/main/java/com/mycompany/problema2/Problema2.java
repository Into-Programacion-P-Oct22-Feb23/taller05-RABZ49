/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema2;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cantidad;
        double precioUnidad;
        double total;
        double total2;
        System.out.println("Ingrese la cantidad que se requiere:");
        cantidad = entrada.nextDouble();
        System.out.println("Ingrese el precio por unidad:");
        precioUnidad = entrada.nextDouble();

        total = cantidad * precioUnidad;

        if (cantidad > 50) {
            total2 = (total * 10) / 100;
            total = total - total2;
        }

        System.out.printf("El valor a cancelar es de:%2s", total);
    }
}
