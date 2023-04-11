/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista02ex05;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
import java.lang.Math;
public class Lista02Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com um numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Entre com outro numero: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Entre com mias um numero: ");
        int num3 = teclado.nextInt();
        
        System.out.print("O maior numero e: ");
        System.out.println(maior(num1,num2,num3));
    }
    static int maior(int num1, int num2){
        return Math.max(num1, num2);
    
    }
    static int maior(int num1, int num2, int num3){
        int aux = maior(num1,num2);
        return Math.max(aux, num3);
    
    }
}
