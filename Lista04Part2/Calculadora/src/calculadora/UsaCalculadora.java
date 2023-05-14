//Rhômulo Morão Caitano dos Santos

package calculadora;

import java.util.Scanner;
public class UsaCalculadora {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       Calculadora calc = new Calculadora();
       System.out.print("Digite a operacao ( + | - | * | / ): ");
       char operacao = teclado.next().charAt(0);
       
       calc.setNumero1();
       calc.setNumero2();
       
       switch(operacao){
           case '+':
               System.out.println("Soma: " + calc.somar());
               break;
            case '-':
               System.out.println("Subtracao: " + calc.subtrair());
               break;
            case '*':
               System.out.println("Soma: " + calc.multiplicar());
               break;
            case '/':
               System.out.println("Soma: " + calc.dividir());
               break;
            default:
                System.out.println("INVALIDO!");
       
       
       }
       
    }
}
