package gp1;

// Escribir un programa que reciba el valor de dos edades y las guarde
// en dos variables. Luego el programa debe intercambiar los valores de
// ambas variables y mostrarlas por pantalla. Por ejemplo, si el usuario
// ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá
// mostrar edad1 = 35 y edad2 = 24.


import java.util.Scanner;


public class Ejercicio7	{
public static void main(String args[]){
  
  int auxiliar = 0, edad1 = 0, edad2 = 0;	

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Ingrese edad 1: ");
  edad1 = entrada.nextInt();     
  System.out.println ("");  

  System.out.print ("Ingrese edad 2: ");
  edad2 = entrada.nextInt();     
  System.out.println ("");

  auxiliar = edad1;
  edad1 = edad2;
  edad2 = auxiliar;	  

  System.out.println ("Edad 1 :" + edad1);
  System.out.println ("Edad 2 :" + edad2);
  
   
  }
}