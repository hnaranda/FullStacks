package gp2;

// Escribir un programa que reciba un n�mero entero por teclado. A
// continuaci�n, mostrar la tabla de multiplicar de ese n�mero.

import java.util.Scanner;

public class Ejercicio1{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   int numero = 0;
   String palabra = "", invertida = "";
   
   
   System.out.println ("*****************************************************");
   System.out.println ("*********GUIA PRACTICA N�2 - Ejercicio N�2***********");
   System.out.println ("*****************************************************");
   System.out.println (""); 
   System.out.println ("");

   System.out.println ("Ingrese una palabra: ");
   palabra= entrada.nextLine();
   
	
   invertida = new StringBuilder(palabra).reverse().toString();
	
	if(invertida.equals(palabra)){
		System.out.println ("Es una palabra pal�ndromo! ");
        }else{
		System.out.println ("No es una palabra pal�ndromo! ");
        }
  }
}