/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasemana4_oscarreyes;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PruebaSemana4_Ex2 {
    
    public static void main(String[] args){
        //Diccionario de Variables
        int consumoTotal = 0, promedioMensual;
        int[] CostoMeses = new int[12];
        Scanner entradaDatos = new Scanner(System.in);
        
        //Entrada - Cantidad de Agua por mes 
        for (int i = 0; i < 12; i++){
            System.out.println("Ingrese el costo del mes " + (i+1));
            CostoMeses[i] = entradaDatos.nextInt();
        }
        
        // Calcula - promedio mensual y consumo annual
        for (int i = 0; i < 12; i++){
            consumoTotal = CostoMeses[i] + consumoTotal;
        }
        promedioMensual = consumoTotal / 12;        
        
        //Salida de datos
        System.out.println("Su consumo annual es de: $" + consumoTotal + "\nSu promedio mensual fue de: $" + promedioMensual);
    }
}
