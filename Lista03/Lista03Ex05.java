/*
 * Lista03Ex05.java
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex05 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = teclado.nextInt();
		
		int contador = 0;
		boolean primo = false;
		int aux = 0;
		int array[] = new int [168];
		
		for (int a = 1 ; a <= 1000 ; a++){
			contador = 0;
			for(int b = 1 ; b <= a ; b++){
				
				if(a % b == 0 ){
					contador++;
					
					}
				}
				if(contador == 2){
					System.out.print(a + ", ");
					array[aux] = a;
					aux++;
					}
					
			}
			System.out.print("\n" + num + " e primo? " + primo(num, array, primo));
		
	}
	
	static boolean primo(int num, int array[], boolean primo){
		
		for(int i = 0 ; i < 168 ; i++){ 
		if(num == array[i]){
			primo = true;
			}
		
		}
		return primo;
		
	}
	
}

