package gp2;

import java.util.Scanner;

public class Ejercicio2{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String palabra = "";


   System.out.println ("*****************************************************");
   System.out.println ("*********GUIA PRACTICA N�2 - Ejercicio N�2***********");
   System.out.println ("*****************************************************");
   System.out.println (""); 
   System.out.println ("");

   System.out.println ("Ingrese una palabra: ");
   palabra= entrada.nextLine();
   
	
   String invertida = new StringBuilder(palabra).reverse().toString();
	
	if(invertida.equals(palabra)){
		System.out.println ("Es una palabra pal�ndromo! ");
        }else{
		System.out.println ("No es una palabra pal�ndromo! ");
        }

   
  
  }
}