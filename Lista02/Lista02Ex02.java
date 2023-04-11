
//Rhômulo Mourão Caitano dos Santos
package lista02ex02;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista02Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Digite outro numero: ");
        int num2 = teclado.nextInt();
        
        System.out.print("O menor numero e: ");
        System.out.println(menor(num1, num2));
        
    }
    
    static int menor(int num1, int num2){
    
    if(num1 < num2){
    return num1;
    }else{
    return num2;
    }
    
    }
    
}
