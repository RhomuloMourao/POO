//Rhômulo Mourão Caitano dos Santos
package lista00ex07;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        int E [][] = new int[N][M];
        int Maior = 1;
        int Menor = 100;
        int IdentLinha;
        int IdentColuna;
        for (int linhas = 0 ; linhas < E.length ; linhas++) {
            for (int colunas = 0 ; colunas < E[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random()*10);
                E[linhas][colunas] = Aleatorio;
                if(E[linhas][colunas] > Maior){
                Maior = E[linhas][colunas];
                }else if(E[linhas][colunas] < Menor){
                Menor = E[linhas][colunas];
                }
                
            }
        }
        for (int i = 0 ; i < E.length ; i++) {
            for (int j = 0 ; j < E[i].length; j++){
            
                System.out.print(E[i][j] + "\t");
                 if (E[i][j] == Maior){
               
                } else if(E[i][j] == Menor){
                
                }
            }
            System.out.println();
        }
        
        
        
          for (int i = 0 ; i < E.length ; i++) {
            for (int j = 0 ; j < E[i].length; j++){
            
                
                 if (E[i][j] == Maior){
                     System.out.print("\nO maior Numero É: " + Maior +" Linha : " + (i+1) + "Coluna : " + (j+1) );
               
                    
                } else if (E[i][j] == Menor){
                    System.out.print("\nO menor Numero É: " + Menor + " Linha : " + (i+1) + "Coluna : " + (j+1) );
                  
                }
            }
            System.out.println();
        }
        
        
        
    }
    
}
