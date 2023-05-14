/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04ex01;

/**
 *
 * @author ALUNO
 */
public class Lampada {
     public static void main (String[] args){
     
     Lista04Ex01 marca = new Lista04Ex01();
     
     marca.insereMarca ("Ourolux");
     System.out.println(marca.retornoLampadaMarca());
     
     Lista04Ex01 modelo = new Lista04Ex01();
     
     modelo.insereModelo ("LED");
     System.out.println(modelo.retornoLampadaModelo());
     
     Lista04Ex01 tipo = new Lista04Ex01();
     
     modelo.insereTipo ("Vapor de Sodio");
     System.out.println(modelo.retornoLampadaTipo());
     
     Lista04Ex01 estado = new Lista04Ex01();
     
     modelo.insereEstado ("Desligada");
     System.out.println(modelo.retornoLampadaEstado());
     
     
     }
}
