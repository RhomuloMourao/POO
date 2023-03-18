//Rhômulo Mourão Caitano dos Santos
package lista01ex01;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista01Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Entre com um numero: ");
        
        double numero = teclado.nextDouble();
        
        if (isPositivo (numero)) {
            System.out.println("Positivo!");
        } else {
            System.out.println("Negativo!");
        }
  
      }  
    
    
    //
    
    static boolean isPositivo (double numero) {
    /*
        if (numero >=0){
            
            return true ;
        } else {
            
            return false;
        }
        */
    /*
     if (numero >=0){
            
            return true ;
        } 
            return false;
        */
        return numero>=0;
    
    } 
}

