
package lista04ex03;

import java.util.Scanner;
public class Lista04Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EstadosLampada estados = new EstadosLampada();
         estados.setEstadosLampada();

         System.out.println("Detalhes da Lampada: ");
         EstadosLampada marca = new EstadosLampada();

         marca.insereMarca ("Marca: Ourolux");
         System.out.println(marca.retornoLampadaMarca());

         EstadosLampada modelo = new EstadosLampada();
 
         modelo.insereModelo ("Modelo: LED");
         System.out.println(modelo.retornoLampadaModelo());

         EstadosLampada tipo = new EstadosLampada();

         modelo.insereTipo ("Tipo: Vapor de Sodio");
         System.out.println(modelo.retornoLampadaTipo());



        System.out.println("Estado: " + estados.getEstadoLampada());
    }
    
}
