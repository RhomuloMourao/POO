/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package Lista00Ex09;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz quadrada: ");
        int N = teclado.nextInt();
        int G[][] = new int [N][N];
         for (int linhas = 0 ; linhas < G.length ; linhas++) {
            for (int colunas = 0 ; colunas < G[linhas].length ; colunas++) {
                int Aleatorio = (int) (Math.random() * 100);
                G[linhas][colunas] = Aleatorio;
                
                
            }
        
        }
        for (int i = 0 ; i < G.length ; i++) {
            for (int j = 0 ; j < G[i].length ; j++) {
                if(i == j){
               System.out.print(G[i][j] + "\t"); 
                }
                else {
                System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
    
}
