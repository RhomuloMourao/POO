/*
 * Lista03Ex14.java
 
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Lista03Ex14 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		System.out.print("Numero invertido: " + numeroInvertido(numero));
		
	}
	static int numeroInvertido(int numero){
		String numeroSTR = Integer.toString(numero);
		StringBuilder inversao = new StringBuilder(numeroSTR);
		return Integer.parseInt(inversao.reverse().toString());
		
		}
	
}

