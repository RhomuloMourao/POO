/*
 * Data.java
 
 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	public boolean validacao;
	
	public void setDia(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		dia = teclado.nextInt();
		
		}
		public int getDia(){
			return dia;
			
			}
	public void setMes(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o mes: ");
		mes = teclado.nextInt();
		
		}
		public int getMes(){
			return mes;
			
			}
		public void setAno(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano ");
		ano = teclado.nextInt();
		
		}
		public int getAno(){
			return ano;
			
			}
		public void setValidacao(){
			
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1 || ano > 9999){
			
			validacao = false;
			
			}else{
				validacao = true;
				
				}
		
		}
		public boolean getValidacao(){
			return validacao;
			
			}
			
			
	public void data(){
		if(getValidacao() == true){
			
			System.out.println("Esta data existe!");
			
			
			}else{
				System.out.print("Data inexistente");
				}
		
		}	
	public void mostrarData(){
		System.out.print("Data:" +  dia + "/" + mes + "/" + ano);
		}	
		
}

