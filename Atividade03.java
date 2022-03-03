package Condicional;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		int I;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		
		I=ler.nextInt();
		
		
    if(I >= 5 && I <= 7) {
    	
    	System.out.println("Você esta na categoria infantil A.");
			
		}
		
    	else if (I >=8 && I <= 11) {
	
			System.out.println("Você esta na categoria infantil B.");
			
		}
		
		else if (I >= 12 && I <= 13) {
	
			System.out.println("Você esta na categoria juvenil A.");
			
		}
		else if (I >= 14 && I <= 17) {
	
			System.out.println("Você esta na categoria juvenil B.");
			
		}
		
		else if (I >= 18) {
	
			System.out.println("Você esta na categoria adulto.");
			
		}
		else if (I <= 5) {
	
			System.out.println("Você não tem idade para esta atividade, aceitamos alunos apartir de 5 anos.");
			
		}
	}
}