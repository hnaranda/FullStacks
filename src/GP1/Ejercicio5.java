package gp1;

import java.util.Scanner;
import java.lang.Math.*;


public class Ejercicio5{
  public static void main(String args[]){
  
  double radio,area,perimetro = 0; 

	
  Scanner entrada = new Scanner(System.in);

  System.out.println ("");

  System.out.println ("Ingrese el radio: ");
  radio = entrada.nextFloat();     
  
		  
  area = Math.PI * (radio * radio);
  System.out.print("El area es " + area);

  perimetro = 2 * Math.PI * radio;
  System.out.print("El area es " + area + " el perimetro es " + perimetro); 		 
 
   
  }
}