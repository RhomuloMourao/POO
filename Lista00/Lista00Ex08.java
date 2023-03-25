//Rhômulo Mourão Caitano dos Santos
package lista00ex08;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        System.out.print("Digite o numero de linhas: ");
        int M = teclado.nextInt();
        
        int tam = N*M;
        int F[][] = new int [N][M];
        int impar[] = new int[tam];
        int par[] = new int[tam];
        int aux1 = 0;
        int aux2 = 0;
        for (int linhas = 0 ; linhas < F.length ; linhas++) {
            for (int colunas = 0 ; colunas < F[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                F[linhas][colunas] = Aleatorio;
                
                if(F[linhas][colunas] % 2 == 0){
                    par[aux1] = F[linhas][colunas];
                    aux1++;
                }else {
                    impar[aux2] = F[linhas][colunas];
                    aux2++;
                }
            }
        
        }
        for (int i = 0 ; i < F.length ; i++) {
            for (int j = 0 ; j < F[i].length ; j++) {
               System.out.print(F[i][j] + "\t"); 
               
            }
            System.out.println();
        }
        System.out.println();
        if(aux1 > 0){
        System.out.print("São " + aux1 + " par(es): ");
        }else{
        System.out.print("NAO TEM PAR");
        }
         for (int k = 0 ; k < aux1 ; k++) {
             
               System.out.print(par[k] + ", "); 
               

        }
         System.out.println();
         if (aux2 > 0){
         System.out.print("São " + aux2 + " impar(es): ");
         }else{
             System.out.print("NAO EXISTE IMPAR");
         
         }
         
         
         for (int s = 0 ; s < aux2 ; s++) {
             
               System.out.print(impar[s] + ", "); 
               

        }
         
         
         
    }
    
}
