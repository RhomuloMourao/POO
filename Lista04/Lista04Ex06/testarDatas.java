/*
 * testarDatas.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class testarDatas{
	public int dia;
	public int mes;
	public int ano;
	public boolean validacao = false;
	public int calculoData1;
	
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
		if(validacao == true){
			
			System.out.println("Esta data existe!");
			
			
			}else{
				System.out.println("Data1 inexistente");
				
				}
			}
			
	public void calculoData1(){
		calculoData1 = dia + (mes*30) + (ano*365);
		
		}	
		
	public int dia2;
	public int mes2;
	public int ano2;
	public boolean validacao2;
	public int calculoData2;
	
	public void setDia2(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		dia2 = teclado.nextInt();
		
		}
		public int getDia2(){
			return dia2;
			
			}
	public void setMes2(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o mes: ");
		mes2 = teclado.nextInt();
		
		}
		public int getMes2(){
			return mes2;
			
			}
		public void setAno2(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano ");
		ano2 = teclado.nextInt();
		
		}
		public int getAno2(){
			return ano2;
			
			}
		public void setValidacao2(){
			
		if(dia2 < 1 || dia2 > 31 || mes2 < 1 || mes2 > 12 || ano2 < 1 || ano2 > 9999){
			
			validacao2 = false;
			
			}else{
				validacao2 = true;
				
				}
		
		}
		
		public boolean getValidacao2(){
			return validacao2;
			
			}
			
			
		public void data2(){
			if(getValidacao2() == true){
			
				System.out.println("Esta data existe!");
				
			
			}else{
				System.out.println("Data2 inexistente");
				
				}
		
		}
		public void calculoData2(){
		calculoData2 = dia2 + (mes2*30) + (ano2*365);
		
		}
		
		public void testadoraDeDatas(){
			if(getValidacao() == true && getValidacao2() == true){
			if(calculoData1 == calculoData2){
				System.out.print("As datas sao iguais");
				}
			if(calculoData1 > calculoData2){
				System.out.println(dia2 + "/" + mes2 + "/" + ano2 + " foi antes de (menor que) " + dia + "/" + mes + "/" + ano );
				System.out.println("A diferenca entre eles e de " + (calculoData1-calculoData2) + " dia(s)");
				}
			if(calculoData2 > calculoData1){
				System.out.println(dia + "/" + mes + "/" + ano + " foi antes de (menor que) " + dia2 + "/" + mes2 + "/" + ano2 );
				System.out.println("A diferenca entre eles e de " + (calculoData2-calculoData1) + " dia(s)");
				}
			}else{
				System.out.print("Alguma das datas e inexistente!");
				}	
			}
	
}

