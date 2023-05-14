/*
 * ConversaoDeUnidadesDeArea.java
 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class ConversaoDeUnidadesDeArea {
		public double metroQuadrado ;
		public double peQuadrado ;
		public double milhaQuadrada ;
		public double acre ;
		
		public double calcmetroQuadrado ;
		public double calcpeQuadrado ;
		public double calcmilhaQuadrada ;
		public double calcacre ;
		
		public void setTodos(){
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite os metros quadrados: ");
			metroQuadrado = teclado.nextDouble();
			
			System.out.print("Digite os pes quadrados: ");
			peQuadrado = teclado.nextDouble();
			
			System.out.print("Digite as milhas quadradas: ");
			milhaQuadrada = teclado.nextDouble();
			
			System.out.print("Digite os acres: ");
			acre = teclado.nextDouble();
			
			}
		
		public void setMetroQuadrado(){
			calcmetroQuadrado = metroQuadrado * 10.76; 
			
			}
			
		public void setPeQuadrado(){
			calcpeQuadrado = peQuadrado * 929; 
			
			}
		public void setMilhaQuadrada(){
			calcmilhaQuadrada = milhaQuadrada * 640; 
			
			}
		public void setAcre(){
			calcacre = acre * 43560; 
			
			}	
			
		public double getMetroQuadrado(){
			return calcmetroQuadrado;
			
			}
		public double getPeQuadrado(){
			return calcpeQuadrado;
			
			}	
		public double getMilhaQuadrada(){
			return calcmilhaQuadrada;
			
			}	
		public double getAcre(){
			return calcacre;
			
			}
			
		public void Conversoes(){
			System.out.println(metroQuadrado + "metro quadrado = " + calcmetroQuadrado + " pe quadrados");
			System.out.println(peQuadrado + "pe quadrado = " + calcpeQuadrado + " centimetros quadrados");
			System.out.println(milhaQuadrada + "milha quadrada = " + calcmilhaQuadrada + " acres");
			System.out.println(acre + "acre = " + calcacre + " pes quadrados");
			}			
	
}

