/*
 * Equacao2Grau.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Equacao2Grau {
	
	public double a;
	public double b;
	public double c;
	public double delta;
	public double raiz1;
	public double raiz2;
	
	public void setA(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		a = teclado.nextDouble();
		
		 while(a == 0){
        System.out.print("Digite o primeiro valor (a) novamente: ");
        a = teclado.nextDouble();
        }
       
		
		}	
		
		public void setB(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de b: ");
		b = teclado.nextDouble();
		
		}	
		public void setC(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de c: ");
		c = teclado.nextDouble();
		
		}	
		
	public void setDelta(){
		delta = (b*b) -4*a*c;
		
		}
	public double getDelta(){
		return delta;
	}
	
	public void setRaizes(){
		raiz1 = ((-b + (Math.sqrt(delta))) / (2 * a));
		raiz2 = ((-b - (Math.sqrt(delta)) ) / (2 * a));
		
		
		}
	public void Equacao(){
		if(delta < 0 ){
			System.out.print("Nao existem raizes reais");
			}else{
				if(delta == 0 ){
					System.out.print("Existe uma raiz real que é: " + raiz1);
					}else{
						
						System.out.println("raiz1: " + raiz1);
						System.out.println("raiz2: " + raiz2);
						}
				
				}
		
		} 			
	
}

