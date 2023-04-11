/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista02ex04;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
import java.lang.Math;
public class Lista02Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       System.out.print("Digite um numero: ");
       int num1 = teclado.nextInt();
       
       System.out.print("Digite outro numero: ");
       int num2 = teclado.nextInt();
       
       System.out.print("O menor numero e: ");
       System.out.println(menor(num1, num2)); 
        
    }
    static int menor(int num1, int num2){
    return Math.min(num1, num2);
    
    }
}
