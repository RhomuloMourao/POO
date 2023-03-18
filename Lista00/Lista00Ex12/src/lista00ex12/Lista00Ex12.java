//Rhômulo Mourão Caitano dos Santos
package lista00ex12;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        int L[][] = new int [N][N];
         for (int linhas = 0 ; linhas < L.length ; linhas++) {
            for (int colunas = 0 ; colunas < L[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                L[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < L.length ; i++) {
            for (int j = 0 ; j < L[i].length ; j++) {
                if(i + 1 == j ){
               System.out.print(L[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
