/*
 * Lista00Ex24.java
 *
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex24 {
	
	public static void main (String[] args) {
		 Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int O[][] = new int [N][M];
        int a = 0;
		int b = 1;
		int aux = 0;
        
         for (int linhas = 0 ; linhas < O.length ; linhas++) {
            for (int colunas = 0 ; colunas < O[linhas].length ; colunas++) {
                
                
            O[linhas][colunas] = a;
			aux = a;
			a+=b;
			b = aux;
             

            }
        
        }
        for (int i = 0 ; i < O.length ; i++) {
            for (int j = 0 ; j < O[i].length ; j++) {
                
               System.out.print(O[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }
	}
}

