//Rhômulo Mourao Caitano dos Santos
package pessoa;

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;

public class Pessoa {

  private String nome;
  private int idade;
  private double altura;
  
public  Pessoa(){


}
public void setNome(){
        
    Scanner tecladoSTR = new Scanner(System.in);
    System.out.print("Digite o nome: ");
    nome = tecladoSTR.nextLine();
    
   
}
public void setIdade(){
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a idade: ");
    idade = teclado.nextInt();
    
   
}

public void setAltura(){

    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a altura: ");
    altura = teclado.nextDouble();
    
    
}

public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}

public double getAltura(){
    return altura;
}

public void fazAniversario(){
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Faz aniversario? (true/false) ");
    boolean faz = teclado.nextBoolean();
    if(faz){
    idade++;
    }
}
public void saida(){

System.out.println("Nome: " + getNome());
System.out.println("Idade: " + getIdade());
System.out.println("Altura: " + getAltura());

}
}
