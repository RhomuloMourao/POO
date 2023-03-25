/*
 * Lista00Ex30.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex30{
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int qnt = teclado.nextInt();
		
		int vetor[] = new int [qnt];
		int contador;
		int aux = 0;
		for (int i = 0 ; i < vetor.length ; i++){
			
			int Random = (int) (Math.random() * 9 + 1);
			vetor[i] = Random;
			
			}
			System.out.println("\n Vetor:");
		for (int j = 0 ; j < vetor.length ; j++){
			
			System.out.print(vetor[j] + ", ");
			
			}
		int matriz[][] = new int[qnt][];
		for (int p = 0 ; p <matriz.length ; p++){
			matriz[p] = new int [vetor[p]+1];
		}
				
		int vetorFibo[] = new int[10];
		int a = 0;
		int b = 1;
				
		
		//for (int numero = 1 ; numero <= 20 ; numero++){
			//contador = 0;
			//for (int primos = numero ; primos>=1 ; primos --){
			//if(numero % primos == 0){
			//contador++;
						
			//}
			//}	
			//if(contador == 2){
				//	vetorPrimos[aux] = numero;
			//		aux++;
			//}
		//}
		for (int i = 0; i< 10 ; i++ ){
			
			vetorFibo[i] = a;
			aux = a;
			a+=b;
			b = aux;
			
			}
		
		System.out.println("\n\n MATRIZ:");
		
			for (int linhas = 0 ; linhas < matriz.length ; linhas++){
				aux = 0;
				for (int colunas = 0 ; colunas < matriz[linhas].length ; colunas++ ){
				if(colunas == 0){
				matriz[linhas][colunas] = vetor[linhas];
				}
				else{
				matriz[linhas][colunas] = vetorFibo[aux];
				aux++;
				}
				}
			}
			for (int i = 0 ; i < matriz.length ; i++){
				for (int j = 0 ; j < matriz[i].length ; j++){
				System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
	}
}

