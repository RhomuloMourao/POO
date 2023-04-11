/*
 * Lista01Ex02.java
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista01Ex02 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		double valor = teclado.nextInt();
		
		if(isZero(valor)){
			System.out.print(valor + " e zero");
			}else{
				System.out.print(valor + " nao e zero");
				
				}
		
	}
	
	static boolean isZero(double valor){
		
		if(valor == 0){
			return true;
			}else{
				return false;
				}
		
		}
	
}

