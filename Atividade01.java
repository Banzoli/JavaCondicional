package Condicional;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
	  Scanner ler = new Scanner(System.in);  
     

    System.out.print("digite 3 numeros para saber qual o maior, Informe o primeiro n�mero: ");
    
    int num1 = Integer.parseInt(ler.nextLine());
    
    System.out.print("Informe o segundo n�mero: ");
    
    int num2 = Integer.parseInt(ler.nextLine());
    
    System.out.print("Informe o terceiro n�mero: ");
    
    int num3 = Integer.parseInt(ler.nextLine());
     
 
    if((num1 > num2) && (num1 > num3)){
    	
      System.out.println("O primeiro n�mero � o maior");
    }
   
    else if((num2 > num1) && (num2 > num3)){
    	
      System.out.println("O segundo n�mero � o maior");
    }
  
    else if((num3 > num1) && (num3 > num2)){
    	
      System.out.println("O terceiro n�mero � o maior");
    }
     
    System.out.println("\n");
  }
}