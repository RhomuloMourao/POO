/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista02ex03;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
import java.lang.Math;
public class Lista02Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Digite um numero: ");
       int num1 = teclado.nextInt();
       
       System.out.print("Digite outro numero: ");
       int num2 = teclado.nextInt();
       
       System.out.print("O Maior numero e: ");
       System.out.println(maior(num1, num2)); 
    }
    
    static int maior(int num1, int num2){
        
    return Math.max(num1,num2);
    
    } 
    
}
