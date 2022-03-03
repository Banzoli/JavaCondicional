package Condicional;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		int N;
		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva um numero. ");

		N =ler.nextInt();

		if(N % 2 == 1) {
			
			System.out.println("e impar.");
			System.out.println("O numero elevado ao quadrado é "+ N*N);		
		}

		else {
			
			System.out.println("e par.");
			System.out.println("A raiz de "+ N +" é "+ Math.sqrt(N));	
			
		}
	}
}