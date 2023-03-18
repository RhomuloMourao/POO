/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista00ex05;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tamanho de linhas:");
        int N = teclado.nextInt();
         System.out.print("Informe o tamanho de colunas: ");
        int M = teclado.nextInt();
        
        int E[][] = new int[N][M];
        int F[][] = new int[N][M];
        
        for (int linha = 0 ; linha < E.length ; linha++) {
            for (int coluna = 0 ; coluna < E[linha].length ; coluna++){
                 int aleatorio = (int) (Math.random() * 51);
                 E[linha][coluna] = aleatorio;
                
            }
        }
             for (int linha2 = 0 ; linha2 < F.length ; linha2++) {
            for (int coluna2 = 0 ; coluna2 < F[linha2].length ; coluna2++){
             int aleatorio = (int) (Math.random() * 50);
                 E[linha2][coluna2] = aleatorio; 
            }
             }
            int G[][] = new int[N][M];
             for (int linha3 = 0 ; linha3 < G.length ; linha3++) {
                for (int coluna3 = 0 ; coluna3 < G[linha3].length ; coluna3++){
           
                 G[linha3][coluna3] = E[linha3][coluna3] + F[linha3][coluna3]; 
            }
                System.out.println("\n ////////////////////////////////////////////");
             for (int i = 0 ; i < G.length ; i++) {
                for (int j = 0 ; j < G[i].length ; j++){
                     System.out.print(G[i][j] + "\t");                                                                               
                                               
            }
            System.out.println();
        }
        
    }
}
}

