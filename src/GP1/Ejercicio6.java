package gp1;

// Pedir al usuario que ingrese el precio de un producto y el porcentaje
// de descuento. A continuación mostrar por pantalla el importe
// descontado y el importe a pagar.

import java.util.Scanner;


public class Ejercicio6	{
public static void main(String args[]){
  
  float precio = 0, descuento = 0;	

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Ingrese el precio del producto: ");
  precio = entrada.nextFloat();     
  System.out.println ("");  

  System.out.print ("Ingrese el porcentaje de descuento a aplicar: ");
  descuento = entrada.nextFloat();     
  System.out.println ("");  

  System.out.println ("Monto Descontado $: " + (precio * (descuento/100)));
  System.out.println ("Precio Final $: " + (precio - (precio * (descuento/100))));
  
   
  }
}