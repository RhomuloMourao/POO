/*
 * Lista01Ex03.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista01Ex03 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		double valor = teclado.nextInt();
		
		if(isZero(valor)){
			System.out.print(valor + " e zero");
			}else if(isPositivo (valor)){
				System.out.print(valor + " e positivo");
				}else{
						System.out.print(valor + " e negativo");
					}
		
		
	}
	static boolean isZero(double valor){
		if(valor == 0){
			return true;
			}else{
				return false;
				}
		}
		
	static boolean isPositivo(double valor){
		if(valor > 0){
			return true;
			}else{
				return false;
				}
		} 	
}

