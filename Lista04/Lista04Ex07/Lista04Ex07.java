/*
 * Lista04Ex07.java

 */
//Rhômulo Mourão Caitano dos Santos

public class Lista04Ex07 {
	
	public static void main (String[] args) {
		
		ModeloDeComputador modelito = new ModeloDeComputador();
		
		modelito.setPlacaMae();
		modelito.setPrecoProcessador();
		modelito.setPrecoMemoria();
		modelito.setPrecoDiscoRigido();
		modelito.setPrecoMonitor();
		modelito.calcularPreco();
		
	}
}

