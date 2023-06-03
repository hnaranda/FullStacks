package gp2;

// Escribir un programa que reciba un número entero por teclado. A
// continuación, mostrar la tabla de multiplicar de ese número.

import java.util.Scanner;

public class Ejercicio1{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   int numero = 0;
   String palabra = "", invertida = "";
   
   
   System.out.println ("*****************************************************");
   System.out.println ("*********GUIA PRACTICA Nº2 - Ejercicio Nº2***********");
   System.out.println ("*****************************************************");
   System.out.println (""); 
   System.out.println ("");

   System.out.println ("Ingrese una palabra: ");
   palabra= entrada.nextLine();
   
	
   invertida = new StringBuilder(palabra).reverse().toString();
	
	if(invertida.equals(palabra)){
		System.out.println ("Es una palabra palíndromo! ");
        }else{
		System.out.println ("No es una palabra palíndromo! ");
        }
  }
}