/*
 * Lista03Ex12.java
  
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex12 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = teclado.nextInt();
		
		int array2[] = new int[10];
		array2 = perfeito(num);
		
		if(num <= 0){
			System.out.print("Numero invalido");
			
		}else{
				
			for(int i = 0 ; i < array2.length ; i++){
				
				if(array2[i] != 0){	
				System.out.print(array2[i] + ", ");
			}
				
			}	
		}
	}
	
	static int[] perfeito(int num){
		
		int array[] = new int[10];
		int divisores;
		int aux = 0;
		for(int j = 1 ; j < num ; j++){
			divisores = 0;	
			for(int i = 1 ; i <= j/2 ; i++){
				if(j % i == 0){
				divisores+= i;
			
				}
				
			
			}
			if(divisores == j){
				array[aux] = j;
				aux++;
				}
				
	}	
		return array;
		
		}
}

