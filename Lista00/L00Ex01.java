/*
 * L00Ex01.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class L00Ex01 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int[][] a = new int[4][5];
		
		System.out.println("Entre com os elementos da Matriz A");
		for ( int i = 0 ; i < a.length ; i++){
			
			for(int j = 0; j < a[i].length ; j++){
				
				System.out.print("Elemento [" + i + ", " + j + "]:")
				a[i][j] = teclado.nextInt();
			}	
		}
		
		System.out.println("\n\nMostrando os vlores da matriz A");
		for (int x = 0 ; x < a.length ; x++){
			
			for(int y = 0 ; y < a[x].length ; y++){
				
				System.out.print( a[x][y] + "\t" );
			}
			
			System.out.println();
		}
	}
}

