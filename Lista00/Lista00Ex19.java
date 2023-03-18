/*
 * Lista00Ex19.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex19 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        
        int aux = N;
        int S[][] = new int [N][N];
         for (int linhas = 0 ; linhas < S.length ; linhas++) {
            for (int colunas = 0 ; colunas < S[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 90 + 10);
                S[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < S.length ; i++) {
            for (int j = 0 ; j < S[i].length ; j++) {
                if(i + j == (N-1) || i == j || (i > j && i < N - 1 - j) || (i < j && i > N - 1 - j) || j == N-N || j == (N - 1) || i == N/2){
               System.out.print(S[i][j] + " "); 
                }
                else {
                System.out.print("  " + " ");
                }
            }
            System.out.println();
        }
		
	}
}

