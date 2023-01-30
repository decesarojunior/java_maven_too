
package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author telmo
 */
import br.edu.ifsul.bcc.too.topico3.util.Compra;
import java.util.List;
import java.util.ArrayList;


public class Exercicio8 {
    
    
    Exercicio8(){
        
        //inicializando a lista.
        List<Compra> lista = new ArrayList();
    
        //criando o objeto c do tipo Compra
        Compra c = new Compra(null, null, null);
        
        lista.add(c);//adicionando o objeto c na lista.
        
        
        //criando o objeto c do tipo Compra
        Compra c2 = new Compra();
        c2.setCodigo(1);
        
        lista.add(c2);//adiciona na lista.
        
    }
    
    
    
    /*
     8. Codifique um método na classe Exercicio8 para criar e inicializar cinco 
        objetos do tipo Compra com as seguintes informações.
    
        Código 1, emissão:  15/10/2020 15:39:00 100, saída 15/10/2020 17:20 300
    
        Código 2, emissão:  16/10/2019 10:39:00 150, saída 16/10/2020 10:59 160
 
        Código 3, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 00:25 100
 
        Código 4, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 01:25 100
 
        Código 5, emissão:  31/12/2020 23:55:00 050, saída 01/01/2021 00:33 100
 
    
        Adicionar os objetos em uma coleção. Após, percorrer e analisar a lista
        para localizar os seguintes objetos/informações:
        
            1) Data de emissão de compra mais recente.
            2) Data de saída mais antiga.
            3) Compra com maior tempo em relação a emissão e a saída.
    */
    
}

