package gp1;

import java.util.Scanner;

public class Ejercicio2{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String nombre = "";

   System.out.println ("*****************************************************");
   System.out.println ("*********GUIA PRACTICA Nº1 - Ejercicio Nº2***********");
   System.out.println ("*****************************************************");
   System.out.println (""); 
   System.out.println ("");

   System.out.println ("Cuál es el nombre del trabajador?");
   nombre =entrada.nextLine();
   System.out.println ("Hola, " + nombre);   
  
  }
}