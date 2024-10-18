/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_progra_sem1;

/**
 *
 * @author Martin Montes
 */
public class Clicks {
 

    public static void main(String[] args) {
        // Definir los precios por clic para los diferentes tramos,AMMM
        int clics1 = 60;
        double costoPorClic1 = 0.30;
        
        int clics2 = 100;
        double costoPorClic2 = 0.25;
        
        int clics3 = 20;
        double costoPorClic3 = 0.80;
        
        // Calcular el costo total para cada grupo de clics
        double costoTotal1 = clics1 * costoPorClic1;
        double costoTotal2 = clics2 * costoPorClic2;
        double costoTotal3 = clics3 * costoPorClic3;
        
        // Calcular el costo total antes del ISV
        double totalSinISV = costoTotal1 + costoTotal2 + costoTotal3;
        
        // Calcular el ISV (16% del total)
        double ISV = totalSinISV * 0.16;
        
        // Calcular el total con el ISV incluido
        double totalConISV = totalSinISV + ISV;
        
        // Mostrar los resultados formateados a dos decimales
        System.out.println("Costo total sin ISV: $" + String.format("%.2f", totalSinISV));
        System.out.println("Total + ISV (16%): $" + String.format("%.2f", totalConISV));
    }
}
   

