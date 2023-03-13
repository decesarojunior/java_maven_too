
package br.edu.ifsul.bcc.too.topico3.exercicios;

//import java.lang.*

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * @author telmo junior
 */

public class Teste {
    
    
    //metodo especial: 
    //esse método é o construtor da classe Teste.
    //o nome do método construtor deverá ser o mesmo da classe
    //é possível ter mais do que um método construtor na mesma classe, no entanto,
    //devem ser assinaturas diferentes.
    public Teste(){
                
    }
    public Teste(float v1, float v2){
                
    }
    
    //definicao de um método em java.
    //assinatura do método: retorno, nome e parâmetros.
    public float funcaoMedia(float v1, float v2){        
        return (v1 + v2) / 2.0f;
    }
    
    public Float funcaoMedia(Float v1, Float v2){
        Float resultado = v1 + v2;
        resultado = resultado / 2f;        
        return resultado;
    }
    
    //método main: é um método especial (é o primeiro a ser executado).
    public static void main(String args[]){        
        System.out.println("chamou a main");
        
        //criacao de variável/objeto
        //nesse caso o tipo objeto t é do tipo Teste. 
        //o objeto t está sendo inicializado com uma nova instância da classe Teste.
        Teste t;
        t = new Teste();
        
        //chamada do metodo funcaoMedia através do objeto t.
        //o retorno do método é armazenado na variável resultado.
        
        //Exercicio: alterar esse rotina para que o usuário informe os dois valores.
        //opção 1: por interface gráfica. (javax.swing.JOptionPane)
        
        //converter de String para float
        /*
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o "
                                    + "primeiro valor float"));
        
        String str = JOptionPane.showInputDialog("Informe o segundo  valor float");
        float v2 = Float.parseFloat(str);
        

        //float r = funcaoMedia(10f, 15f);        
        float resultado = t.funcaoMedia(v1, v2);
        */
        
        //opção 2: por linha de comando. (java.util.Scanner)
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Informe o primeiro valor float: ");
        String v1_scanner = myObj.nextLine(); 
        
        System.out.println("Informe o segundo valor float: ");
        String v2_scanner = myObj.nextLine(); 
        
        //converter de String para float
        
        float resultado = t.funcaoMedia(Float.parseFloat(v1_scanner), 
                                        Float.parseFloat(v2_scanner));
        
        
        //operador + nesse caso está realizando uma concatencao de string com float.
        System.out.println("Media: " + resultado);
        
    }
    
    //1)definir um método que receba por parâmetros dois valores inteiros
    //esse metodo deverá calcular a media dos valores recebidos
    //e retornar um valor float.
    
    //2) criar o método main, chamar o método criado no exercicio 1,
    //informando os valores para os parâmetros
    //imprimir na saída padrão o valor correspondente a média.
    
    
    
}
