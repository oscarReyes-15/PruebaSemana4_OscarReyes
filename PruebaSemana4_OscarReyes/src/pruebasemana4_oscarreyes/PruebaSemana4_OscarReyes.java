/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasemana4_oscarreyes;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PruebaSemana4_OscarReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diccionario de Variables
        int Total = 0, ingresoCantidad = 0, i = 0;
        Scanner entradaDatos = new Scanner(System.in);
        
        //Entrada - Cuantos productos ingresa
        System.out.print("Ingrese en numeros enteros la cantidad de productos comprados: ");
        ingresoCantidad = entradaDatos.nextInt();
        int[] Productos = new int[ingresoCantidad + 1];
        
        //Entrada - Ingresa precios de cada producto (Basado en la cantidad)
        for (i = 0; i < ingresoCantidad; i++){
            System.out.print("Ingrese el precio del productos: ");
            Productos[i] = entradaDatos.nextInt();
        }
        
        //Proceso o Calculo - Calcula el costo total
        for (i = 0; i < ingresoCantidad; i++){
            Total = Productos[i] + Total;
        }
        
        //Salida
        System.out.println("El costo total de su compra: $" + Total);
    }

}
    
