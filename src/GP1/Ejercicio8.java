package gp1;

import java.util.Scanner;


public class Ejercicio8{
public static void main(String args[]){
  
  int temperatura = 0;	

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Ingrese la temperatura en grados Celcius: ");
  temperatura = entrada.nextInt();     
  System.out.println ("");  

  System.out.println ("En Kelvin sería " + (temperatura + 273.15));
  System.out.println ("En Fahrenheit sería :" + ( (temperatura *9/5) + 32) );
  
   
  }
}