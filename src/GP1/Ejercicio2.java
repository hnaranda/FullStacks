package gp1;

// Escribir un programa en el cual se le pregunte al usuario su nombre. A
// continuaci�n, mostrar un mensaje que diga ?Hola, ? completando el
// mensaje con el nombre que ingres� el usuario.

import java.util.Scanner;

public class Ejercicio2{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String nombre = "";

   System.out.println ("*****************************************************");
   System.out.println ("*********GUIA PRACTICA N�1 - Ejercicio N�2***********");
   System.out.println ("*****************************************************");
   System.out.println (""); 
   System.out.println ("");

   System.out.println ("Cu�l es el nombre del trabajador?");
   nombre =entrada.nextLine();
   System.out.println ("Hola, " + nombre);   
  
  }
}