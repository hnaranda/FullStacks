package gp2;

// Escribir un algoritmo que lea un valor n por teclado y muestre los
// primeros n t�rminos de la sucesi�n de Fibonacci.

import java.util.Scanner;
import java.lang.Math.*;


public class Ejercicio5{
  public static void main(String args[]){
  
  int numero= 0,numerosFibonacci=1,valorAnterior=0,resultado=0;  
             
	
  Scanner entrada = new Scanner(System.in);

  System.out.println ("");

  System.out.println ("Ingrese n�mero: ");
  numero = entrada.nextInt();     
  
	
	System.out.println (valorAnterior+"-	");
	System.out.println (numerosFibonacci+"-	");
	  
  while(numero>1){
	
        resultado=  numerosFibonacci+valorAnterior;
 
	System.out.println (resultado+"    -	");
	valorAnterior = numerosFibonacci;
	numerosFibonacci=resultado;
  	 
        numero-=1;
  }
   
  }
}