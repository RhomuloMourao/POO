/*
 * Lista00Ex26.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex26 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int W[][] = new int [N][M];
		int WDecrescente[][] = new int [N][M];
		int aux = 0;
		
		
		for (int linhas = 0; linhas < W.length; linhas++) {
            for (int colunas = 0; colunas < W[linhas].length; colunas++) {
                int Random = (int) (Math.random() * 100);
                W[linhas][colunas] = Random;
                WDecrescente[linhas][colunas] = W[linhas][colunas];
            }
        }
        
         for (int linhas = 0 ; linhas < WDecrescente.length ; linhas++) {
            for (int colunas = 0 ; colunas < WDecrescente[linhas].length ; colunas++) {
           
            for (int linhas2 = 0 ; linhas2 < W.length ; linhas2++) {
				for (int colunas2 = 0 ; colunas2 < WDecrescente[linhas2].length ; colunas2++) {
					if(WDecrescente[linhas][colunas] >  WDecrescente[linhas2][colunas2]){
					aux = WDecrescente[linhas][colunas];
					WDecrescente[linhas][colunas] = WDecrescente[linhas2][colunas2] ;
					WDecrescente[linhas2][colunas2] = aux;
					
					}
				}
			}
		}
	}
       
        System.out.println("/////////////////// Matriz nao ordenada ///////////////////");
        
        for (int i = 0 ; i < W.length ; i++) {
            for (int j = 0 ; j < W[i].length ; j++) {
                
               System.out.print(W[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }
            
            System.out.println("\n\n/////////////////// Matriz em ordem Decrescente ///////////////////");
             for (int i = 0 ; i < WDecrescente.length ; i++) {
				for (int j = 0 ; j < WDecrescente[i].length ; j++) {
					System.out.print(WDecrescente[i][j] + "\t"); 
                }
                System.out.println();
            }  
	}
}

