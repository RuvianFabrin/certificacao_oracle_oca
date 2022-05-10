package br.com.ruvian.certificacao;

public class HelloWord {
    public static void main(String params[]) {
        //não roda se o main não for publico
        System.out.println("Rodando o Programa !!!");
        System.out.println(params.length);

        // oque você passar pela linha de comando irá aparecer aqui
        // java HelloWord primeiro segundo
        for (int i = 0; i < params.length; i++) {
            System.out.println(i + " => " + params[i]);
        }

        //o javac vem com o JDK
        //Diz em qual versão o Java vai rodar
        // javac -source 1.3 HelloWord.java
        //Para rodar dentro de um pacote
        //java certificacao.Teste

        //Passar propriedade
        //Use o -D antes da classe
        //java -Dsistema=producao -Dproduto=certificacao certificacao.Teste

        //CLASSPATH define onde ele vai procurar as classes
        //Normalmente é o diretório atual
        //dá pra usar assim também (mais indicado que colocar nas variaveis de ambiente)
        //java -classpath . certificacao.Teste
        //java -cp . certificacao.Teste
        
    }
}
