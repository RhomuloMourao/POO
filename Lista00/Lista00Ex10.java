
//Rhômulo Mourão Caitano dos Santos
package lista00ex10;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        int H[][] = new int [N][N];
         for (int linhas = 0 ; linhas < H.length ; linhas++) {
            for (int colunas = 0 ; colunas < H[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                H[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < H.length ; i++) {
            for (int j = 0 ; j < H[i].length ; j++) {
                if(i + j == (N-1)){
               System.out.print(H[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
