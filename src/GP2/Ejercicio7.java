package gp2;

// Del listado de abajo, determinar qué animal eligió el usuario mediante
// la realización de tres preguntas del tipo SI/NO acerca de las tres
// características elegidas (herbívoro, mamífero, doméstico). Mostrar el
// resultado por pantalla.

import java.util.Scanner;


public class Ejercicio7{
 public static void main(String args[]){
  
  String respuesta1= "", respuesta2 = "", respuesta3 = "";	

  String matriz[][] = {{"Alce","SI","SI","NO"},{"Caballo","SI","SI","SI"},{"Caracol","SI","NO","NO"},{"Cóndor","NO","NO","NO"},{"Gato","NO","SI","SI"},{"León","NO","SI","NO"},{"Pitón","NO","NO","SI"},{"Toruga","SI","NO","SI"}};

  Scanner entrada = new Scanner(System.in);

  System.out.print ("Hervíboro (SI/NO): ");
  respuesta1 = entrada.nextLine();     
  System.out.println ("");  

  System.out.print ("Mamífero: (SI/NO) ");
  respuesta2 = entrada.nextLine();     
  System.out.println ("");

  System.out.print ("Doméstico: (SI/NO) ");
  respuesta3 = entrada.nextLine();     
  System.out.println ("");

  
  for(int f=0;f<=7;f++){

	if (matriz[f][1].equals(respuesta1) && matriz[f][2].equals(respuesta2) && matriz[f][3].equals(respuesta3)){
		System.out.println ("El animal elegido es "+ matriz[f][0]);
	}
  }
 
 
 }
}