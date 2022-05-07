//Só pode ter um pacote (package) em uma classe Java e é opcional
package br.com.ruvian.certificacao;

//Quando não tem pacote está no pacote padrão, diretório raiz

//Depois você pode ter varios imports, que vem depois do Package
//import java.util.Date;
//import java.io.*;

//Atenção:
//Tenha somente uma classe publica por arquivo Java
//E essa classe deve ter o mesmo nome do arquivo, assim fica fácil de achar
//Depois Classes, interfaces, enuns
public class Pessoa {
    //Dentro da classe você pode ter:
    //instância
    String nome;

    //Construtores - Chamado quando o objeto é instanciado
    //Tem o mesmo nome da classe
    //Não tem retorno, porque ele já está retornando o objeto criado
    //Só pode ter o return vazio
    Pessoa(String nome){
        this.nome = nome;//Parâmetros
    }

    //Métodos
    public String getNome() {
        String sobrenome = "Seu Sobrenome";//Variáveis locais
        return nome + sobrenome;
    }

    //===========================================================
    //Comentário pode ir em qualquer lugar
    //Tem dois tipos de comentário o // e o /* Comentário aqui */
    //Tem também o java Doc, como exemplo abaixo
    /** Javadoc
     * 
     */

    //Como tudo é opcional, até um arquivo vazio compila

    
}

class B{
    //Padrão do Java nome de variável é "minúsculo", mesmo assim compila
    int B;//não tem conflito entre nome de variável e nome de classe igual

    //Isso é construtor
    B(){

    }
    //Isso é um mótodo, e mesmo assim compila, apesar de ser má prática
    public void B() {
        
    }
}
interface Figura{
    //Pode ter variaveis e métodos

    //Variáveis constantes, que não pode ter seu valor alterado
    //Por padrão ele é estático (static), publico (public) e final
    //public static final int TAMANHO = 5;
    int TAMANHO = 5;//é a mesma coisa do de cima

    //Métodos abstratos publicos
    //Por padrão ele é abstrato (abstract) e publico (public)
    //public abstract void autentica(String nome, String senha);
    void autentica(String nome, String senha);//é a mesma coisa do de cima


}
