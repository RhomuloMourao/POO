/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista01ex04;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista01Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o primeiro valor (a): ");
        double a = teclado.nextInt();
        
        System.out.print("Digite o segundo valor (b): ");
        double b = teclado.nextInt();
        
        System.out.print("Digite o terceiro valor (c): ");
        double c = teclado.nextInt();
        
        System.out.print("O valor de delta é: " ) ;
        System.out.print(delta(a,b,c));
    }
    
   static double delta(double a, double b, double c){
       
   return (b*b)-4*a*c;
   
   } 
    
}
