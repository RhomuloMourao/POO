/*
 * Lista00Ex26.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Lista00Ex26 {
	
	 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int nLinha = teclado.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int nColuna = teclado.nextInt();

        int matriz[][] = new int[nLinha][nColuna];
        int ODecrescente[][] = new int[nLinha][nColuna];
        int aux = 0;

        // aqui iremos fazer a matriz com os numeros aleatorios linhas e colunas
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                int Random = (int) (Math.random() * 100);
                matriz[linhas][colunas] = Random;
                ODecrescente[linhas][colunas] = matriz[linhas][colunas];
            }
        }


        for (int linhas = 0 ; linhas < ODecrescente.length ; linhas++) {
            for (int colunas = 0 ; colunas < ODecrescente[linhas].length ; colunas++) {
                int Random = (int) (Math.random() * 100 );
                matriz[linhas][colunas] = Random;
                ODecrescente[linhas][colunas] = matriz[linhas][colunas];
                for (int linhas2 = 0 ; linhas2 < matriz.length ; linhas2++) {
                    for (int colunas2=0; colunas2 < ODecrescente[linhas2].length ; colunas2++) {
                        if(ODecrescente[linhas][colunas] > ODecrescente[linhas2][colunas2]){
                            aux = ODecrescente[linhas][colunas];
                            ODecrescente[linhas][colunas] = ODecrescente[linhas2][colunas2] ;
                            ODecrescente[linhas2][colunas2] = aux;

                        }
                    }
                }
            }
        }

        // Imprimindo a matriz não ordenada
        System.out.println("/////////////////// Matriz nao ordenada ///////////////////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimindo a matriz ordenada em ordem decrescente
        System.out.println("\n\n/////////////////// Matriz em ordem Decrescente ///////////////////");
        for (int i = 0; i < ODecrescente.length; i++) {
            for (int j = 0; j < ODecrescente[i].length; j++) {
                System.out.print(ODecrescente[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
