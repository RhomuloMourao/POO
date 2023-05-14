/*
 * ModeloDeComputador.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class ModeloDeComputador {
	
		private int precoPlacaMae;
		private int precoProcessador;
		private int precoMemoria;
		private int precoDiscoRigido;
		private int precoMonitor;
		
		public void setPlacaMae(){
		precoPlacaMae = 800;	
			
			}
		public int getPlacaMae(){
		return precoPlacaMae;	
			}	
			
		public void setPrecoProcessador(){
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite quanto mhz tem o processador (1600, 1800, 1900): ");
			int mhz = teclado.nextInt();
			if(mhz == 1600){
				precoProcessador = 700;
			}
			if(mhz == 1800){
			precoProcessador = 830;
			}
			if(mhz == 1900){
			precoProcessador = 910;
			}
			
			}
		public int getPrecoProcessador(){
			
			return precoProcessador;
			}
			
			
		public void setPrecoMemoria(){
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite quantos GB tem a memoria (1, 2, 4 , 6 ou 8): ");
			int mGB = teclado.nextInt();
			if(mGB == 1){
			precoMemoria = 350;	
			}
			if(mGB == 2){
			precoMemoria = 700;	
			}
			if(mGB == 4){
			precoMemoria = 1050;	
			}
			if(mGB == 6){
			precoMemoria = 1400;	
			}
			if(mGB == 8){
			precoMemoria = 1750;	
			}
			
			}
		public int getPrecoMemoria(){
			return precoMemoria;
			}
		public void setPrecoDiscoRigido(){
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite quantos GB tem seu disco rigido (500GB, 1TB, 2TB): ");
			int drGB = teclado.nextInt();
			if(drGB == 500){
			precoDiscoRigido = 300;	
				
			}
			if(drGB == 1){
			precoDiscoRigido = 420;	
				
			}
			if(drGB == 2){
			precoDiscoRigido = 500;	
				
			}
			
					
			}	
			
		public int getPrecoDiscoRigido(){
			return precoDiscoRigido;
			}
			
		public void setPrecoMonitor(){
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite quantas polegadas tem o monitor (15 ou 17): ");
			int polegadas = teclado.nextInt();
			if(polegadas == 15){
			precoMonitor = 320;	
			}
			if(polegadas == 17){
			precoMonitor = 520;	
			}
				
			}
		public int getPrecoMonitor(){
			return precoMonitor;
			}
		public void calcularPreco (){
			System.out.print("O preco do computador e: " + (getPlacaMae() + getPrecoProcessador() + getPrecoMemoria() + getPrecoDiscoRigido() + getPrecoMonitor() ));
			
			}
		
}

