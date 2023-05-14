/*
 * Lista03Ex07.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex07 {
	
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite outro numero: ");
		int num2 = teclado.nextInt();
		
			
			System.out.print(mdc(num1, num2));
			
		
	}
	
	static int mdc (int num1, int num2){
	
			
		int resto;
		while(num2!= 0){
			resto = num1 %  num2;
			num1 = num2;
			num2 = resto;
			}
		return num1;
	}
	
}

