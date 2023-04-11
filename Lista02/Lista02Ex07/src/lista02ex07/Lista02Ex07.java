/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista02ex07;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;

public class Lista02Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoSTR = new Scanner(System.in);
        
        char simOuNao = 'S';
        
        do{
        System.out.print("Quer jogar o dado s/n: ");
        simOuNao = tecladoSTR.next().toUpperCase().charAt(0);
        
        if(simOuNao == 'S'){
        System.out.print("Saiu: ");
        System.out.println(dado());
        }
        
        }while(simOuNao == 'S' );
        
        
        
    }
    
    static int dado(){
    int random =  (int) (Math.random() * 6) +1;   
    return random;
    }
    
}
