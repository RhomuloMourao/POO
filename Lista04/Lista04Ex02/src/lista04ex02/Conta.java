
package lista04ex02;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class Conta {
    
    
    public  int precoConta;
    public  int qntdPessoas;                                                                                                        
    public  boolean taxaGarcom;
    public int valorTotal;
    
    float valor = 0;
    public void setprecoConta (){
        
        Scanner teclado = new Scanner(System.in);
           System.out.print("Digite o valor da conta: ");
            int vprecoConta= teclado.nextInt();
           
       this.precoConta = vprecoConta;
   
   }
    public int getprecoConta (){
       
       return precoConta;
   
   }
    public void setqntdPessoas (){
        
        Scanner teclado = new Scanner(System.in);
           System.out.print("Digite a quantidade de pessoas: ");
            int vqntdPessoas= teclado.nextInt();
           
       this.qntdPessoas = vqntdPessoas;
   
   }
    public int getqntdPessoas (){
       
       return qntdPessoas;
   
   }
     public void settaxaGarcom (){
        
        Scanner tecladoSTR = new Scanner(System.in);
        System.out.print("Taxa Garcom? (S/N): ");
        String vtaxaGarcom = tecladoSTR.next().toUpperCase();
        if(vtaxaGarcom.charAt(0) == 'S'){
        this.taxaGarcom = true;
        }else{
        this.taxaGarcom = false;
        }   
      
   
   }
    public boolean gettaxaGarcom (){
       
       return taxaGarcom;
   
   }
    public void calculoValorTotal (){
        
        if(gettaxaGarcom() == true){
            valor = (precoConta* 1.1F)/qntdPessoas;
            
            
        }else{
        valor = precoConta/getqntdPessoas();
        }
        
        
        }
    public void resultado (){
    calculoValorTotal();
        System.out.println("Valor total: " + precoConta );
        System.out.println("Quantidade de pessoas: " + qntdPessoas );
        System.out.println("Taxa do garcom? " + taxaGarcom );
        System.out.println("Valor que cada um tera que pagar: " + valor );
    }
      
   
   }
    

