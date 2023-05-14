/*
 * Numero.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Numero {
	
	
		private int numero;
		
		public Numero(){
			
			}
			
			
		public void setNumero(){
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			numero = teclado.nextInt();
			
			}
		public int getNumero(){
			return numero;
			
			}
		public int inverter(){
			String num = Integer.toString(getNumero());
			
			StringBuilder inv = new StringBuilder(num);
			
			return Integer.parseInt(inv.reverse().toString());
			
			}
			
		public void saida(){
			
			System.out.print("Numero invertido: " + inverter());
			}
	}


