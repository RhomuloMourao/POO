/*
 * Lista03Ex06.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
import java.lang.Math;
public class Lista03Ex06 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite outro numero inteiro: ");
		int num2 = teclado.nextInt();
		int array[] = new int[num1 + num2];

		array = primos(num1, num2);
		
		for(int i = 0 ; i < array.length ; i++){
            if(array[i] != 0){
                System.out.print(array[i] + ", ");
            }
        }

		//System.out.print(">>" + primos(num1, num2));
		
	}
	
	static int[] primos(int num1, int num2){
		
		int contador;
		int aux = 0;
		int array[] = new int [168];
		
		for (int a = Math.min(num1, num2) ; a <= Math.max(num1, num2) ; a++){
			contador = 0;
			for(int b = 1 ; b <= a ; b++){
				
				if(a % b == 0 ){
					contador++;
					
					}
				}
				if(contador == 2){
					
					array[aux] = a;
					aux++;
					}
					
			}
		return array;
		}
		
}

