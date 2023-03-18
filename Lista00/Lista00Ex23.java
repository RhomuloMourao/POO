/*
 * Lista00Ex23.java
 * 
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex23 {
	
	public static void main (String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int O[][] = new int [N][M];
        
        int contador = 0;
         for (int linhas = 0 ; linhas < O.length ; linhas++) {
            for (int colunas = 0 ; colunas < O[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 90 + 10);
                
                for(int a = 1; a <= 100 ; a++){
					
					if(Aleatorio % a == 0){
					contador++;
					}
				}
                   if(contador == 2){
					O[linhas][colunas] = Aleatorio;
				}
				else{
					colunas--;
					}
                contador = 0;
             

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


