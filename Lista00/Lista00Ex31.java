/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista00ex31;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista00Ex31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas: ");
        int N = teclado.nextInt();
        
        System.out.print("Digite o numero de colunas: ");
        int M = teclado.nextInt();
        
        System.out.print("Informe o valor inicial: ");
        int valorI = teclado.nextInt();
        
        System.out.print("Informe o valor final: ");
        int valorF = teclado.nextInt();
        
        int Matriz[][] = new int[N][M];
        for (int linhas = 0 ; linhas < Matriz.length ; linhas++ ){
            for (int colunas = 0 ;  colunas < Matriz[linhas].length ; colunas++){
            int Random = (int) (Math.random() * (valorF-valorI+1) ) + valorI;
            Matriz[linhas][colunas] = Random;
            }
        
        }
        for (int i = 0 ; i < Matriz.length ; i++){
            for (int j = 0 ; j<Matriz[i].length ; j++){
                System.out.print(Matriz[i][j] + " ");
                
            }
            System.out.println();
        }
        
    }
    
}
