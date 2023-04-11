/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista02ex06;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
import java.lang.Math;
public class Lista02Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoSTR = new Scanner(System.in);
        
        
        char simOuNao = 'S';
        int contador = 0;
        int aux;
        do{
            contador++;
            System.out.print("Digite um numero: ");
            int num = teclado.nextInt();
            
            aux = menor(num);
            
            
            System.out.print("Inserir outro s/n: ");
            simOuNao = tecladoSTR.next().toUpperCase().charAt(0);
        
            
        }while(simOuNao == 'S');
        
        System.out.print("O menor numero e: ");
        System.out.println(aux);
        
    }
    static int menor(int num){
    int aux = Integer.MAX_VALUE; 
    
    if(num < aux ){
    aux = num;
    }
    return aux;
    
    }
}
