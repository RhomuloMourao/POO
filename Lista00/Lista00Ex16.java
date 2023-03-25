//Rhômulo Mourão Caitano dos Santos
package lista00ex16;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        int O[][] = new int [N][N];
         for (int linhas = 0 ; linhas < O.length ; linhas++) {
            for (int colunas = 0 ; colunas < O[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                O[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < O.length ; i++) {
            for (int j = 0 ; j < O[i].length ; j++) {
                if(i + j == (N-1) || i == j || i == j+1 || i + j -1 == (N-1)){
               System.out.print(O[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
