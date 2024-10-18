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
public class Cuotas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario,AMMM
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el monto del préstamo
        System.out.print("Ingresa el monto del préstamo (HNL): ");
        double montoPrestamo = scanner.nextDouble();
       
        // Solicitar el plazo en meses
        System.out.print("Ingresa el plazo de pago en meses: ");
        int plazoMeses = scanner.nextInt();
       
        // Solicitar el interés mensual
        System.out.print("Ingresa el interés mensual aplicado (en porcentaje, ej. 5.0): ");
        double interesMensual = scanner.nextDouble() / 100;  // Convertimos a decimal
        
       // Solicitar la comisión por cuota
        System.out.print("Ingresa la comisión por cuota (HNL): ");
        double comisionCuota = scanner.nextDouble();
       
        // Solicitar el porcentaje del seguro mensual
        System.out.print("Ingresa el porcentaje del seguro mensual aplicado a la cuota (ej. 1.5): ");
        double seguroMensual = scanner.nextDouble() / 100;  // Convertimos a decimal
       
        // Calcular el pago de interés simple por mes
        double pagoInteresMensual = montoPrestamo * interesMensual;
       
        // Calcular el seguro mensual
        double seguroMensualCuota = montoPrestamo * seguroMensual;
      
        // Calcular la cuota mensual total
        double cuotaMensual = (montoPrestamo / plazoMeses) + pagoInteresMensual + comisionCuota + seguroMensualCuota;
       
        // Calcular el total a pagar (cuota mensual multiplicada por el número de meses)
        double totalPagar = cuotaMensual * plazoMeses;
      
        // Mostrar las cuotas mensuales y el total a pagar
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f\n", cuotaMensual);
        System.out.printf("Total a Pagar: HNL %.2f\n", totalPagar);
    }
}
