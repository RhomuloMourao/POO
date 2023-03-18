//Rhômulo Mourão Caitano dos Santos
package lista00ex13;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;

public class Lista00Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        int K[][] = new int [N][N];
         for (int linhas = 0 ; linhas < K.length ; linhas++) {
            for (int colunas = 0 ; colunas < K[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                K[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < K.length ; i++) {
            for (int j = 0 ; j < K[i].length ; j++) {
                if(i + j ==  N ){
               System.out.print(K[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
