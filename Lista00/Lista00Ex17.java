/*
 * Lista00Ex17.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex17 {
	
	public static void main (String[] args) {
		 Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        int Q[][] = new int [N][N];
         for (int linhas = 0 ; linhas < Q.length ; linhas++) {
            for (int colunas = 0 ; colunas < Q[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                Q[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < Q.length ; i++) {
            for (int j = 0 ; j < Q[i].length ; j++) {
                if(i + j == (N-1) || i == j || i+1 == j || i + j -1 == (N-1)){
               System.out.print(Q[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
		
		
	}
}

