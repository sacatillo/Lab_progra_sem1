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
public class Planillaempleado {

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Se solicitar al usuario que ingrese el nombre del empleado
        System.out.print("Ingresa el nombre completo del empleado: ");
        String nombreEmpleado = scanner.nextLine();  // nextLine() para aceptar espacios
        // Se solicitar al usuario las horas trabajadas en el mes
        System.out.print("Ingresa las horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();
        // Se solicitar al usuario la tarifa por hora
        System.out.print("Ingresa la tarifa por hora (Lps): ");
        double tarifaPorHora = scanner.nextDouble();
        // Calcular el salario mensual y el salario semanal
        double salarioMensual = horasTrabajadas * tarifaPorHora;
        double salarioSemanal = salarioMensual / 4;
        // Mostrar la boleta del empleado
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Hora de Trabajo Mensual: " + horasTrabajadas);
        System.out.println("Tarifa por Hora: Lps. " + tarifaPorHora);
        System.out.println("Salario del Empleado Semanal: Lps. " + salarioSemanal);
    }
}

