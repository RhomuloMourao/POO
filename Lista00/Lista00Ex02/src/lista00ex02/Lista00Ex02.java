/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista00ex02;

/**
 *
 * @author ALUNO
 */
public class Lista00Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] b = new int[6][3];
        
        
        
        for ( int i = 0 ; i < b.length ; i++){

            for ( int j = 0 ; j < b[i].length ; j++){
                int aleatorio =(int) (Math.random()*100);
                b[i][j] = aleatorio;
            }
        }
        
        System.out.println("\nMostrando os valores da Matriz B: ");
        
        for ( int m = 0 ; m < b.length ; m++){
            
            for ( int n = 0 ; n < b[m].length ; n++){
                System.out.print(b[m][n] + "\t");
                
            }
            System.out.println();
        }
        System.out.println("\n Mostrando os valores da Matriz B ao contrario");
        
        for ( int y =  (3 - 1) ; y >= 0 ; y--){
            
         for ( int x = 6 - 1 ; x >= 0  ; x--){
            
            
                System.out.print(b[x][y] + "\t");
                
            }
            System.out.println();
            
        }
    }
}
