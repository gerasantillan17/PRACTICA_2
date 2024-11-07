/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
     System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Números en orden ascendente:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

        System.out.println("Números en orden descendente:");
        for (int i = mayor; i >= menor; i--) {
            System.out.println(i);
        }
    }
}
