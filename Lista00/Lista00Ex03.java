/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista00ex03;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        N = teclado.nextInt();
        
        int [][] C = new int [N][N];
        
        for (int linha = 0 ; linha < C.length ; linha++ ) {
            for (int coluna = 0 ; coluna < C[linha].length ; coluna++) {
            
            int aleatorio = (int) (Math.random() * 100);
            C[linha][coluna] = aleatorio;
            }
        
        }
         for (int linha = 0 ; linha < C.length ; linha++ ) {
            for (int coluna = 0 ; coluna < C[linha].length ; coluna++) {
            
            System.out.print(C[linha][coluna] + "\t");
            }
        System.out.println();
        }
        
        
        
        
    }
    
}
