/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista00ex04;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o tamanho de linhas:");
        int N = teclado.nextInt();
        while(N < 1){
        System.out.print("Informe o tamanho de linhas novamente:");
        N = teclado.nextInt();
        }
        System.out.print("Informe o tamanho de colunas: ");
        int M = teclado.nextInt();
        while(M < 1){
        System.out.print("Informe o tamanho de colunas novamente:");
        M = teclado.nextInt();
        }
        System.out.print("Informe um valor maximo para os numeros aleatorios: ");
        int a = teclado.nextInt();
        
        int D[][] = new int[N][M];
        
        for (int linha = 0 ; linha < D.length ; linha++) {
           for (int coluna = 0 ; coluna < D[linha].length ; coluna++) {
               int aleatorio = (int) (Math.random() * a);
               D[linha][coluna] = aleatorio;
           }
        
        }
        for (int linha = 0 ; linha < D.length ; linha++) {
           for (int coluna = 0 ; coluna < D[linha].length ; coluna++) {
               System.out.print(D[linha][coluna] + "\t");
           }
         System.out.println();
        }
    }
    
}
