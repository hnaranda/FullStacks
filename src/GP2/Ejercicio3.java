package gp2;

// Escribir un programa que ordene un arreglo de números enteros de
// manera ascendente.

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   int cantidad = 0;
   int[] vector;

	 
	

   System.out.println ("*****************************************************");
   System.out.println ("*********GUIA PRACTICA Nº2 - Ejercicio Nº3***********");
   System.out.println ("*****************************************************");
   System.out.println (""); 
   System.out.println ("");

   System.out.println ("Cuántos números va a ingresar al vector: ");
   cantidad = entrada.nextInt();
   vector = new int[cantidad];

   for(int i = 0; i < cantidad; i++){
	System.out.print ("Posición " + i + "-");
	vector[i]= entrada.nextInt();
	System.out.println("");
   }

	System.out.println("Vector ingresado");

   for(int i = 0; i < cantidad; i++){
	System.out.print (vector[i] + "-");
	
   }
   
   Arrays.sort(vector);  
   
   System.out.println("");
   System.out.println("Vector con orden ascendente");

   for(int i = 0; i < cantidad; i++){
	System.out.print (vector[i] + "-");
	
   }
  
  }
}