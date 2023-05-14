/*
 * Lista03Ex09.java

 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex09 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite outro numero: ");
		int num2 = teclado.nextInt();
		
		
		System.out.print(mmc(num1, num2));
		
	}
	
	static int mmc (int num1, int num2){
	
			int mmc = 1;
		for( int numero = 2 ; numero <= Math.max( num1, num2 ) ; numero ++ ){
			while( num1 % numero == 0 || num2 % numero ==0 ){
				if( num1 % numero == 0 && num2 % numero == 0 ){
					mmc *= numero;
					num1 /= numero;
					num2 /= numero;
				}else if( num1 % numero == 0 && num2 % numero != 0 ){
					mmc *= numero;
					num1 /= numero;
				}else if( num1 % numero != 0 && num2 % numero == 0 ){
					mmc *= numero;
					num2 /= numero;
				}
			}
			if( num1 == 1 && num2 == 1 ){
				break;
			}
		}
		return mmc;
	}
	
}

