/*
 * Lista00Ex21.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex21 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas da primeira e segunda matriz: ");
		int N = teclado.nextInt();
		
		System.out.print("Digite o numero de colunas da primeira matriz: ");
		int M = teclado.nextInt();
		
		System.out.print("Digite o numero de colunas da segunda matriz: ");
		int P = teclado.nextInt();
		
		int R[][] = new int [N][M];
		int S[][] = new int [N][P];
		int T[][] = new int [N][M+P];
		
		for (int linhas = 0 ; linhas < R.length ; linhas ++) {
			for (int colunas = 0 ; colunas < R[linhas].length ; colunas ++) {
				int Random = (int) (Math.random() * 90 + 10);
				R[linhas][colunas] = Random;
				T[linhas][colunas] = R[linhas][colunas];
				}
			}
			
		for (int linhas = 0 ; linhas < S.length ; linhas ++) {
			for (int colunas = 0 ; colunas < S[linhas].length ; colunas ++) {
				int Random = (int) (Math.random() * 90 + 10);
				S[linhas][colunas] = Random;
				T[linhas][colunas+M] = S[linhas][colunas];
				}
			}
			
		for (int linhas = 0 ; linhas < T.length ; linhas ++) {
			for (int colunas = 0 ; colunas < T[linhas].length ; colunas ++) {
					
				}
			}
		
		
		
		System.out.println("/////////////////// MATRIZ 1 /////////////////// ");
		for (int i = 0 ; i < R.length ; i ++) {
			for (int j = 0 ; j < R[i].length ; j ++) {
				
				System.out.print(R[i][j] + "  ");
				}
			System.out.println();
			}
			
			
			
			System.out.println("/////////////////// MATRIZ 2 /////////////////// ");
		for (int i = 0 ; i < S.length ; i ++) {
			for (int j = 0 ; j < S[i].length ; j ++) {
				
				System.out.print(S[i][j] + "  ");
				}
			System.out.println();
			}
			
			
			
			System.out.println("/////////////////// MATRIZ 3 /////////////////// ");
		for (int i = 0 ; i < T.length ; i ++) {
			for (int j = 0 ; j < T[i].length ; j ++) {
				
				System.out.print(T[i][j] + "  ");
				}
			System.out.println();
			}
		
	}
}

