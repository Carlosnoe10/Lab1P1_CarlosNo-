/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_carlosnoé;

import java.util.Scanner;

public class Lab1_CarlosNoé {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner ( System.in);
        
        System.out.println ("--Bienvenido al sistema calculo promedio--");
        System.out.print ("Ingrese su nombre: ");
        String nombre = entrada.nextLine ();
        
        // Se ingresa la nota de la 4 cuatro clases
        System.out.print ("Ingrese la nota final de la primer clase: ");
        double primeraClase = entrada.nextDouble ();
        
        System.out.print ("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble ();
        
        System.out.print ("Ingrese la nota final de la tercer clase: ");
        double terceraClase = entrada.nextDouble();
    
        System.out.print ("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble ();
        
        //Se calculo del promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        //Se imprime el calculo del promedio
        
         System.out.println("----" + nombre + " el promedio de las cuatro clases es: " + promedio);
    
    
    }
    
    
}
