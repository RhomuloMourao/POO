/*
 * Lista00Ex06.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex06 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o tanto de linhas: ");
		int N = teclado.nextInt();
		System.out.print("Informe o tanto de colunas: ");
		int M = teclado.nextInt();
		
		System.out.print("Digite o numero que quer ser encontrado: ");
		int num = teclado.nextInt();
		int H [][] = new int [N][M];
		
		int contador = 0;
		
		for (int linha = 0 ; linha < H.length ; linha++ ) {
			for (int coluna = 0 ; coluna < H[linha].length ; coluna++) {
				int aleatorio = (int) (Math.random()*26);
				H[linha][coluna] = aleatorio;
				}
			}
			
		for (int i = 0 ; i < H.length ; i++ ) {
			for (int j = 0 ; j < H[i].length ; j++) {
				
				System.out.print(H[i][j] + "\t");
					if(H[i][j] == num){
					
					contador++;
					
					}
				}
				System.out.println();
			}
			System.out.println("O valor digitado aparece na matriz na matriz? " + contador + "vez(es)") ;
			for (int i = 0 ; i < H.length ; i++ ) {
				for (int j = 0 ; j < H[i].length ; j++) {
				
				if(H[i][j] == num){
					System.out.print("Linha: " + (i+1) + ", "  );
					System.out.print("Coluna: " + (j+1) + ", " );
					contador++;
					}
					
					
				
				
				}
				
			}
		
		
	}
}

