/*
 * Lista00Ex27.java

 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Arrays;
import java.util.Scanner;
public class Lista00Ex27 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int X[][] = new int [N][M];
		int XCrescente[][] = new int [N][M];
		int aux = 0;
		
		
         for (int linhas = 0 ; linhas < X.length ; linhas++) {
            for (int colunas = 0 ; colunas < X[linhas].length ; colunas++) {
                
            int Random = (int) (Math.random() * 100 );    
            X[linhas][colunas] = Random;
            XCrescente[linhas][colunas] = X[linhas][colunas];
            
            
             for(int i = 0; i < XCrescente.length; i++) {
            Arrays.parallelSort(XCrescente[i]);
        } 
}
}   
        System.out.println("/////////////////// Matriz nao ordenada ///////////////////");
        
        for (int i = 0 ; i < X.length ; i++) {
            for (int j = 0 ; j < X[i].length ; j++) {
                
               System.out.print(X[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }
            
            System.out.println("\n\n/////////////////// Matriz em ordem crescente ///////////////////");
             for (int i = 0 ; i < XCrescente.length ; i++) {
				for (int j = 0 ; j < XCrescente[i].length ; j++) {
                
               System.out.print(XCrescente[i][j] + "\t"); 
                
               
                }
                System.out.println();
            }  
	}
}

