/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_progra_sem1;

import java.util.Scanner;

/**
 *
 * @author Martin Montes
 */
public class Formulas { 

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario,AMMM
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar numerador y denominador para la primera fraccion
        System.out.print("Numerador 1: ");
        double numerador1 = scanner.nextDouble();
        
        System.out.print("Denominador 1: ");
        double denominador1 = scanner.nextDouble();
        
        // Solicitar numerador y denominador para la segunda fraccion
        System.out.print("Numerador 2: ");
        double numerador2 = scanner.nextDouble();
        
        System.out.print("Denominador 2: ");
        double denominador2 = scanner.nextDouble();
        
        // Calcular el resultado de la suma de las fracciones
        double resultado = (numerador1 / denominador1) + (numerador2 / denominador2);
        
        // Mostrar el resultado
        System.out.printf("El resultado es: %.2f\n", resultado);
    }
}

