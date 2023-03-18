/*
 * Lista00Ex18.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex18 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        
        int R[][] = new int [N][N];
         for (int linhas = 0 ; linhas < R.length ; linhas++) {
            for (int colunas = 0 ; colunas < R[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                R[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < R.length ; i++) {
            for (int j = 0 ; j < R[i].length ; j++) {
                if(i + j == (N-1) || i == j || i+1 == j || i + j +1 == (N-1)){
               System.out.print(R[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
	}
}

