/*
 * Lista03Ex02.java
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex02 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoSTR = new Scanner(System.in);
		
		char leitor = 'S';
		//char celcius = 'C';
		//char fahrenheit = 'F';
		
		
		 do{
			 
			 
			System.out.print("[C]Celsius, [F] Fahrenheit e [S] Sair: ");
			leitor = tecladoSTR.next().toUpperCase().charAt(0);
			if(leitor == 'C'){
				System.out.print("Digite a temperatura: ");
				int celcius = teclado.nextInt();
				
				System.out.print("Saida: ");
				System.out.println(fahren(celcius));
				}
			if(leitor == 'F'){
				System.out.print("Digite a temperatura: ");
				int fahrenheit = teclado.nextInt();
				
				System.out.print("Saida: ");
				System.out.println(celcius(fahrenheit));
				}
			if(leitor != 'S' && leitor != 'F' && leitor != 'C' && leitor != 's' && leitor != 'f' && leitor != 'c'){
				System.out.println("Opcao Invalida");
				}	
				
        
        
        }while(leitor !='S' );
		
		
	}
	static int fahren(int celcius){
		int calc = (9*celcius/5) + 32;
		return calc;
		
		
		}
	static int celcius(int fahrenheit){
		int calc = 5*(fahrenheit-32) / 9;
		return calc;
		
		
		}
}

