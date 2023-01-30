
package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author telmo
 */
public class Exercicio5 {
    
    static String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
    */
    
    //constutor da classe.
    public Exercicio5(){
              System.out.println("executou o construtor da classe");
    }
    
    private void manipulaDados(){//metodo da classe
        
        System.out.println("executou o metodo manipulaDados()");
        
        
        
        
    }
    
    public static void main(String args[]){//metodo main
        
        
        
        
        
        
        Exercicio5 e5 = new Exercicio5();//objeto da classe
        e5.manipulaDados();//chamada do metodo a partir do objeto.
        
    }
    
    
    
    
    
}
