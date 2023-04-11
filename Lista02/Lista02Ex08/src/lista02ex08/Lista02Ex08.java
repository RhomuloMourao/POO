/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rhômulo Mourão Caitano dos Santos
package lista02ex08;

import java.util.Scanner;
public class Lista02Ex08 {

    /**
     * @param args the command line arguments
     */
    static double contador = 0;
    static double contador1 = 0; 
    static double contador2 = 0; 
    static double contador3 = 0; 
    static double contador4 = 0; 
    static double contador5 = 0; 
    static double contador6 = 0;
    
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
        System.out.println("Numero 1: " + (contador1/contador) * 100 + "%");
        System.out.println("Numero 2: " + (contador2/contador) * 100 + "%");
        System.out.println("Numero 3: " + (contador3/contador) * 100 + "%");
        System.out.println("Numero 4: " + (contador4/contador) * 100 + "%");
        System.out.println("Numero 5: " + (contador5/contador) * 100 + "%");
        System.out.println("Numero 6: " + (contador6/contador) * 100 + "%");
    }
    static int dado(){
         
        int random =  (int) (Math.random() * 6) +1; 
        contador++;
        if (random == 1){
        contador1++;
        }
        if (random == 2){
        contador2++;
        }
        if (random == 3){
        contador3++;
        }
        if (random == 4){
        contador4++;
        }
        if (random == 5){
        contador5++;
        }
        if (random == 6){
        contador6++;
        }
    return random;
    
    
    
    }
}
