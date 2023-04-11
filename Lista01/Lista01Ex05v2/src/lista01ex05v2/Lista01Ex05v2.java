/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitnao dos Santos
package lista01ex05v2;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;
public class Lista01Ex05v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o primeiro valor (a): ");
        double a = teclado.nextInt();
        
        while(a == 0){
        System.out.print("Digite o primeiro valor (a) novamente: ");
        a = teclado.nextInt();
        }
        
        System.out.print("Digite o segundo valor (b): ");
        double b = teclado.nextInt();
        
        System.out.print("Digite o terceiro valor (c): ");
        double c = teclado.nextInt();
        
        System.out.print("O valor de delta é: " ) ;
        System.out.println(delta(a,b,c));
        
        //double macaco = delta(a, b, c);
        
        double r[] = raizes(a,b,c);
        
        if(r.length == 0){
        System.out.print("Nao Existem raizes");
        }else{
        for(int i = 0 ; i < r.length  ; i++){
            
        System.out.println(r[i]);
       
        }
        
        }
        
        
        
        
        
        
       
    }
    static double delta(double a, double b, double c){
  
    return (b*b) -(4*a*c);
   
   
   } 
    static double[] raizes(double a, double b, double c){
        double d = delta(a,b,c);
        double array[] = new double[0];
        
        
        if(d==0){
        array = new double[1];
        array[0] = -b/ (2*a) ;
        
        }
        if(d>0){
        array = new double [2];
        
        array[0] = (-b + (Math.sqrt(d))) / 2*a;
        
        array[1] = (-b - (Math.sqrt(d)) )/ (2*a);
        
        }
        
    return array;
    
    }
    
    
    
}
