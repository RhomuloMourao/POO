
//Rhômulo Mourão Caitano dos Santos
package lista01ex05;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;

public class Lista01Ex05 {

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
        
        double macaco = delta(a, b, c);
        
        if(delta(a,b,c) >= 0){
        System.out.print("Primeira raiz: " );
        System.out.println(raizMais(a,b,macaco));
        
        System.out.print("Segunda raiz: " );
        System.out.println(raizMenos(a,b,macaco));
        
        }else{
        
        System.out.println("Seu resultado é 0");
        }
        
    }
    static double delta(double a, double b, double c){
       double deltinha = (b*b) -4*a*c;
   return deltinha;
   
   
   } 
    static double raizMais(double a, double b, double deltinha){
    
    return ((-b + (Math.sqrt(deltinha))) / 2*a);
    
    }
    
    static double raizMenos(double a, double b, double deltinha){
        
    return ((-b - (Math.sqrt(deltinha)) )/ (2*a)) ;
    
    }
}
