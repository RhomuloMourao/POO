/*
 * Lista00Ex25.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex25 {
	
	public static void main (String[] args) {
		 Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int Y[][] = new int [N][M];
		int YCrescente[][] = new int [N][M];
		int aux = 0;
		
		
         for (int linhas = 0 ; linhas < Y.length ; linhas++) {
            for (int colunas = 0 ; colunas < Y[linhas].length ; colunas++) {
                
            int Random = (int) (Math.random() * 100 );    
            Y[linhas][colunas] = Random;
            YCrescente[linhas][colunas] = Y[linhas][colunas];
            for (int linhas2 = 0 ; linhas2 < Y.length ; linhas2++) {
					for (int colunas2 = 0 ; colunas2 < Y[linhas2].length ; colunas2++) {
				
              
					if(YCrescente[linhas][colunas] <  YCrescente[linhas2][colunas2]){
					
					aux = YCrescente[linhas][colunas];
					YCrescente[linhas][colunas] = YCrescente[linhas2][colunas2] ;
					YCrescente[linhas2][colunas2] = aux;
					
					
					}
				}
			}
		}
	}
       
        System.out.println("/////////////////// Matriz nao ordenada ///////////////////");
        
        for (int i = 0 ; i < Y.length ; i++) {
            for (int j = 0 ; j < Y[i].length ; j++) {
                
               System.out.print(Y[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }
            
            System.out.println("\n\n/////////////////// Matriz em ordem crescente ///////////////////");
             for (int i = 0 ; i < YCrescente.length ; i++) {
				for (int j = 0 ; j < YCrescente[i].length ; j++) {
                
               System.out.print(YCrescente[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }  
		}
	}

