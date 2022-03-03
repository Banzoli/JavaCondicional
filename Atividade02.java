package Condicional;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o um numero: ");
		
		n1=ler.nextInt();
		
		System.out.println("Escreva o mais um numero: ");
		
		n2=ler.nextInt();
		
		
		System.out.println("Escreva o mais um numero: ");
		
		n3=ler.nextInt();
		
    if(n1 < n2) {
    	
    	if(n2<n3) {
    		
    		System.out.println(n1+"\n"+n2+"\n"+n3);
    
    	}
    	else if (n1 < n3) {
    		System.out.println(n1+"\n"+n3+"\n"+n2);
    	}
    	else {
    		System.out.println(n3+"\n"+n1+"\n"+n2);
    	}
    }
    else if(n2 < n3) {
    	if(n1 < n3) {
    		System.out.println(n2+"\n"+n1+"\n"+n3);
    	}
    	else {
    		System.out.println(n2+"\n"+n3+"\n"+n1);
    	}
    }else {
    	System.out.println(n3+"\n"+n2+"\n"+n1);
    }
  }
}
