/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04ex03;

/**
 *
 * @author ALUNO
 */
       

import java.util.Scanner;
public class EstadosLampada {
     
     
     
    public String marca;
    private String modelo;
    private String tipo;
    private int estado;
    private String estadoLampada;
    
   public void insereMarca (String pMarca){
        
       if(! pMarca.isEmpty()){
       
           marca = pMarca;
       }
   
   }
   
   public void insereModelo (String pModelo){
        
       if(! pModelo.isEmpty()){
       
           modelo = pModelo;
       }
   
   }
   
   public void insereTipo (String pTipo){
        
       if(! pTipo.isEmpty()){
       
           tipo = pTipo;
       }
   
   }
   
   public void setEstadosLampada (){
         Scanner teclado = new Scanner(System.in);
         
         System.out.print("Qual estado da Lampada: Acesa(1), Meia-Luz(2), Apagada(3)? ");
         estado = teclado.nextInt();
         while(estado > 3 || estado < 1){
         System.out.print("Qual estado da Lampada: Acesa(1), Meia-Luz(2), Apagada(3)? ");
         estado = teclado.nextInt();
         }
         
         if(estado == 1){
         estadoLampada = "Acesa";
         }
         if(estado == 2){
         estadoLampada = "Meia-Luz";
         }
         if(estado == 3){
         estadoLampada = "Apagada";
         }
         
        
     }
   
   public String retornoLampadaMarca(){
       
       return marca;
       
   }
   public String retornoLampadaModelo(){
       
       return modelo;
       
   }
   public String retornoLampadaTipo(){
       
       return tipo;
       
   }
   public String getEstadoLampada(){
       
       return estadoLampada;
       
   }
   
   
}
