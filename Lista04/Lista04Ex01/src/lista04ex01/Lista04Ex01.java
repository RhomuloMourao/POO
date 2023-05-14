//Rhômulo Mourão Caitano dos Santos
package lista04ex01;



public class Lista04Ex01 {
    private String marca;
    private String modelo;
    private String tipo;
    private String estado;
    
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
   
   public void insereEstado (String pEstado){
        
       if(! pEstado.isEmpty()){
       
           estado = pEstado;
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
   public String retornoLampadaEstado(){
       
       return estado;
       
   }
    
}
