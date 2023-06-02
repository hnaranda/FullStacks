package gp1;

import java.util.Scanner;


public class Ejercicio9{
public static void main(String args[]){
  
  int pesos = 0;	

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Ingrese el Monto : $");
  pesos = entrada.nextInt();     
  System.out.println ("");  

  System.out.print ("En dolares sería US$");
  System.out.printf("%.2f %n" , (pesos / 231.68));

  System.out.print ("En Euros sería E$");
  System.out.printf("%.2f %n" , (pesos / 250.69));

  System.out.print ("En Guaranies sería G$"); 
  System.out.printf("%.2f %n" , (pesos / 31.00));
  
  System.out.print ("En Reales sería R$");  
  System.out.printf("%.2f %n" ,(pesos / 46.81));
   
  }
}