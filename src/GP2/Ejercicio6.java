package gp2;

public class Ejercicio6	{
 public static void main(String args[]){
  
  int divisibles = 0;	
  double resto=0;

  for(int i=200;i>0;i--){
   divisibles=0;
   for(int f=i;f>0;f--) if ((i%f) == 0) divisibles += 1;	
   if (divisibles == 2) System.out.println (i + " es un número primo");
  }
  
   
 }			
}