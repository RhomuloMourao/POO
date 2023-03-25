/*
 * Lista00Ex32.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex32 {
	
	public static void main (String[] args) {
		
		int N = (int) (Math.random() * 5 + 2);
		int M = N;
		int matriz[][] = new int [N+1][M+1];
		
		
        
		for (int linhas = 0 ; linhas < (matriz.length-1) ; linhas++) {
			for (int colunas = 0 ; colunas < (matriz[linhas].length-1) ; colunas++) {
				
				int Random = (int) (Math.random() * 9);
				matriz[linhas][colunas] = Random;
			
				
				
				
			}
		}
		int somaLinha[] = new int[N];
        int somaColuna[] = new int[M];
        int somaDiagonalP = 0;
        int posicaoLinha = 0;
        int posicaoColuna = 0;
        int posicao = 0;
        
        for(int i = 0; i < (matriz.length - 1); i++) 
        {
            posicaoColuna = 0;
            
            for(int j = 0; j < (matriz[i].length - 1); j++) 
            {
                somaLinha[posicaoLinha] += matriz[i][j];
                somaColuna[posicaoColuna++] += matriz[i][j];
                if(i == j){
				somaDiagonalP+= matriz[i][j];
					}
            }
            posicaoColuna = 0;
            
            matriz[posicao++][M] = somaLinha[posicaoLinha];
            
            posicaoLinha++;
            
            for(int k = 0; k < M; k++) 
            {
                matriz[N][k] = somaColuna[posicaoColuna++];
                
            }
            
        }
		matriz[N][M] = somaDiagonalP;
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				System.out.print(matriz[i][j] + "\t");
				}
				System.out.println();
			}
		
		
		
	}
}

