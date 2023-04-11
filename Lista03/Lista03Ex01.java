/*
 * Lista03Ex01.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Lista03Ex01 {
	
	
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em celcius: ");
		int celcius = teclado.nextInt();
		
		
		
		System.out.print("A temperatura em Fahrenheit e: ");
		System.out.println(temp(celcius));
		
	}
	
	static int temp (int celcius){
		
		int fahren = (9*celcius/5) + 32;
		
		return fahren;
		
		
		}
	
}

