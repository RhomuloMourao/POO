/*
 * Lista03Ex04.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
import java.lang.Math;
public class Lista03Ex04 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = teclado.nextInt();
		
		while(nota1 < 0 || nota1 > 10){
			nota1 = 0;
			}
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = teclado.nextInt();
		
		while(nota2 < 0 || nota2 > 10){
			nota2 = 0;
			}
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = teclado.nextInt();
		
		
		
		while(nota3 < 0 || nota3 > 10){
			nota3 = 0;
			}
			
			double n[] = calculos(nota1, nota2, nota3);
			
			for(int i = 0 ; i < n.length ; i ++){
				
				if(i == 0){	
					System.out.println("Media maiores: " + n[i]);
				
				}
				if(i == 1){	
					System.out.println("Media aritmetica: " + n[i]);
				
				}
				if(i == 2){	
					System.out.println("Maior Nota " + n[i]);
				
				}
				if(i == 3){	
					System.out.println("Menor Nota: " + n[i]);
				
				}
				
			}
		
	}
	
	
	static double[] calculos(double nota1, double nota2, double nota3){
		
		
			
		double media = (nota1+nota2+nota3)/3;
		
		
		double aux = Math.max(nota1, nota2);
        double maiorNota = Math.max(aux, nota3);
        
        double mediaMaiores = 0;
        double maior = 0;
        double segundaMaior = 0;
        if(nota1 > nota2){
			maior = nota1;
			segundaMaior = Math.max(nota2,nota3);
			mediaMaiores = (maior+segundaMaior)/2;
		}else{
			maior = nota2;
			segundaMaior = Math.max(nota1,nota3);
			mediaMaiores = (maior+segundaMaior)/2;
				}

        double aux2 = Math.min(nota1, nota2);
        double menorNota = Math.min(aux2, nota3);
        
        double array[] = new double[4];
        
        array[0] = mediaMaiores;
        array[1] = media;
        array[2] = maiorNota;
        array[3] = menorNota;
        
        return array;
		}
}

