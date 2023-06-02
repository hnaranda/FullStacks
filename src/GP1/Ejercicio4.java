package gp1;

import java.util.Scanner;


public class Ejercicio4{
public static void main(String args[]){
  
  int cantidadEstaturas = 0; 
  float sumaEstaturas = 0;	

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Cuántas estaturas va a cargar: ");
  cantidadEstaturas = entrada.nextInt();     
  System.out.println ("");  

  for(int i=1;i<=cantidadEstaturas;i++){
	System.out.print("ingresa la estatura " + i +": ");
	sumaEstaturas += entrada.nextFloat();    	     	
  }
  System.out.println ("");  
  System.out.print("La estatura promedio es " + sumaEstaturas/cantidadEstaturas); 		 
 
   
  }
}