/*
 * Lista03Ex03.java

 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista03Ex03 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoSTR = new Scanner(System.in);
		
		char leitor = 'S';
		//char celcius = 'C';
		//char fahrenheit = 'F';
		
		
		 do{
			 
			 
			System.out.print("[C] Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
			leitor = tecladoSTR.next().toUpperCase().charAt(0);
			int aux = 0;
			int aux2 = 0;
			if(leitor == 'C'){
				System.out.print("Digite a temperatura: ");
				int celcius = teclado.nextInt();
				aux = celcius;
				
				System.out.print("F: ");
				System.out.println(fahren(celcius));
				System.out.print("K: ");
				System.out.println(celcKelvin(celcius));
				
				
				}
				
			if(leitor == 'F'){
				System.out.print("Digite a temperatura: ");
				int fahrenheit = teclado.nextInt();
				aux2 = fahrenheit;
				System.out.print("C: ");
				System.out.println(celcius(aux2));
				System.out.print("K: ");
				System.out.println(fahrenKelvin(fahrenheit));
				
				
				}
				
			if(leitor == 'K'){
				System.out.print("Digite a temperatura: ");
				int kelvin = teclado.nextInt();
				
				System.out.print("C: ");
				System.out.println(kelvinParaCelc(kelvin));
				System.out.print("F: ");
				System.out.println(kelvinParaFahren(kelvin));
				
				} 
				
				
			if(leitor != 'S' && leitor != 'F' && leitor != 'C' && leitor != 's' && leitor != 'f' && leitor != 'c' && leitor != 'K' && leitor != 'k'){
				System.out.println("Opcao Invalida");
				}	
				
        
        
        }while(leitor !='S' );
		
		
	}
	static int fahren(int celcius){
		int calc = (9*celcius/5) + 32;
		return calc;
		
		
		}
	static int celcius(int aux2){
		int calc = 5*(aux2-32) / 9;
		return calc;
		
		
		}

		static int celcKelvin (int aux){
		int calc = aux + 273;
		return calc;
		
		
		}
		static int fahrenKelvin (int fahrenheit){
		int calc = (5*(fahrenheit-32))/9 + 273;
		return calc;
		
		
		}
		static int kelvinParaFahren (int kelvin){
		int calc = (9*(kelvin-273)/5) + 32;
		return calc;
		
		
		}
		
		static int kelvinParaCelc (int kelvin){
		int calc = kelvin-273;
		return calc;
		
		
		}
}

