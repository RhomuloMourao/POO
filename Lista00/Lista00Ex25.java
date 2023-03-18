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
        
        int O[][] = new int [N][M];
		int OCrescente[][] = new int [N][M];
		int aux = 0;
		
		
         for (int linhas = 0 ; linhas < O.length ; linhas++) {
            for (int colunas = 0 ; colunas < O[linhas].length ; colunas++) {
                
            int Random = (int) (Math.random() * 100 );    
            O[linhas][colunas] = Random;
            OCrescente[linhas][colunas] = O[linhas][colunas];
            for (int linhas2 = 0 ; linhas2 < O.length ; linhas2++) {
					for (int colunas2 = 0 ; colunas2 < O[linhas2].length ; colunas2++) {
				
              
					if(OCrescente[linhas][colunas] <  OCrescente[linhas2][colunas2]){
					
					aux = OCrescente[linhas][colunas];
					OCrescente[linhas][colunas] = OCrescente[linhas2][colunas2] ;
					OCrescente[linhas2][colunas2] = aux;
					
					
					}
				}
			}
		}
	}
       
        System.out.println("/////////////////// Matriz nao ordenada ///////////////////");
        
        for (int i = 0 ; i < O.length ; i++) {
            for (int j = 0 ; j < O[i].length ; j++) {
                
               System.out.print(O[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }
            
            System.out.println("\n\n/////////////////// Matriz em ordem crescente ///////////////////");
             for (int i = 0 ; i < OCrescente.length ; i++) {
				for (int j = 0 ; j < OCrescente[i].length ; j++) {
                
               System.out.print(OCrescente[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }  
		}
	}

