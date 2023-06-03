package gp2;

// Escribir un algoritmo que calcule el factorial de un número ingresado
// por teclado.

import java.util.Scanner;


public class Ejercicio4        {
 public static void main(String args[]){
  
  double factorial = 1; 
  int numero = 0;

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Ingrese un número: ");
  numero = entrada.nextInt();     
  System.out.println ("");  

  while(numero>0){
   System.out.print(numero +" - ");
   factorial = factorial * numero;
   numero=numero-1;
  }	
  
  System.out.println ("");  
 
  System.out.print("El factorial es " + factorial); 		 
   
 }
}
