//Rhômulo Mourao Caitano dos Santos
package calculadora;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Calculadora {

    private int numero1;
    private int numero2;
    
    public Calculadora(){
    
    }
    
    public void setNumero1(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        numero1 = teclado.nextInt();
    }
     public void setNumero2(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        numero2 = teclado.nextInt();
    }
     public int getNumero1(){
         return numero1;
     
     }
     public int getNumero2(){
         return numero2;
     
     }
     public int somar(){
         return getNumero1() + getNumero2();
     
     }
     public int subtrair(){
         return getNumero1() - getNumero2();
     
     }
     public int multiplicar(){
         return getNumero1() * getNumero2();
     
     }
     public double dividir(){
         return getNumero1() / getNumero2();
     
     }
}
