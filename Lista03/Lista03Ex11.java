/*
 * Lista03Ex11.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex11 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = teclado.nextInt();
		
		boolean perfeito = false;
		if(num <= 0){
			System.out.print("Numero invalido");
			
			}else{
				if(perfeito(num, perfeito) == true){
					System.out.print(num + " e perfeito");
					}else{
						
						System.out.print(num + " Nao e perfeito");
						}
				
				
				}
		
		
	}
	
	static boolean perfeito(int num, boolean perfeito){
		int divisores = 0;
		for(int i = 1 ; i < num ; i++){
			if(num % i == 0){
			divisores+= i;
			
			}
			
		}
		if(num == divisores){
			perfeito = true;
			}else{
				perfeito = false;
				}
				
		return perfeito;
		
		}
	
}

