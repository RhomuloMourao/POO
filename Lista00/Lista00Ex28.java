/*
 * Lista00Ex28.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex28{
	
	public static void main (String[] args) {
		 Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int Z[][] = new int [N][M];
		int ZCrescente[][] = new int [N][M];
		int aux = 0;
		
		
         for (int linhas = 0 ; linhas < Z.length ; linhas++) {
            for (int colunas = 0 ; colunas < Z[linhas].length ; colunas++) {
                
            int Random = (int) (Math.random() * 100 );    
            Z[linhas][colunas] = Random;
            ZCrescente[linhas][colunas] = Z[linhas][colunas];
           
		}
	}
       
			for (int j = (M-1) ; j >= 0 ; j--) {
				for (int q = (N-1) ; q>=0  ; q--) {
					for(int k = (q-1) ; k>= 0 ; k --)
              
					if(ZCrescente[q][j] <  ZCrescente[k][j]){
					
					aux = ZCrescente[q][j];
					ZCrescente[q][j] = ZCrescente[k][j] ;
					ZCrescente[k][j] = aux;
					
					
					}
				}
			}
        System.out.println("/////////////////// Matriz nao ordenada ///////////////////");
        
        for (int i = 0 ; i < Z.length ; i++) {
            for (int j = 0 ; j < Z[i].length ; j++) {
                
               System.out.print(Z[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }
            
            System.out.println("\n\n/////////////////// Matriz em ordem crescente ///////////////////");
             for (int i = 0 ; i < ZCrescente.length ; i++) {
				for (int j = 0 ; j < ZCrescente[i].length ; j++) {
                
               System.out.print(ZCrescente[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }  
	}
}

