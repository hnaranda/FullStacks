package gp1;

import java.util.Scanner;

public class Ejercicio3{
  public static void main(String args[]){
  float numeroUno = 0, numeroDos =0; 

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Ingrese un n�mero: ");
  numeroUno =entrada.nextFloat();
  System.out.println ("");   
  
  System.out.print ("Ingrese otro n�mero: ");
  numeroDos =entrada.nextFloat();
  System.out.println ("");   
     
  System.out.println("El resultado de la suma es " + (numeroUno + numeroDos));
  System.out.println("El resultado de la resta es " + (numeroUno - numeroDos));
  System.out.println("El resultado de la multiplicaci�n es " + (numeroUno * numeroDos));
  System.out.println("El resultado de la suma es " + (numeroUno /numeroDos));
  }
}