/*
 * Ano.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ano {
	
	private int ano;
	
	public Ano(){
		
		}
	public void setAno(){
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		ano = teclado.nextInt();
		
		
		
		}	
	public int getAno(){
		return ano;
		
		}
	public boolean ehBissexto(){
		if(getAno() % 4 == 0 || getAno() % 100 == 0){
			return true;
			}
		else{
			return false;		
				}
		
		}		
	public void saida(){
		if(ehBissexto()){
			System.out.print("Esse ano eh bissexto!");
			}
		else{
			System.out.print("Esse ano nao eh bissexto!");
			}	
		}	
}

