//Quando não tem pacote está no pacote padrão, diretório raiz
class Pessoa {
    //Toda instância nova vai referênciar a essa mesma variável
    //Variáveis estáticas posso acessar dentro de qualquer escopo
    static int id = 1;

    //método estático
    static void metodo(){
        System.out.println(id);
    }
    
    public void setId(int id) {
        //posso ter uma variável local com o mesmo nome da variável membro
        Pessoa.id = id;
    }
}

class classeX{
    int a =10;
    public void metodo(){
        int a = 20;//Shadowing - esconde a variavel membro com a variável local
        System.out.println(a);
    }
}

public class Teste {
    // A variável só pode ser acessada dentro de seu escopo (Chaves {})

    //Variável de Intância ou de objeto
    String nome3="Nome 3"; //Pode ser acessada de qualquer lugar dentro dessa classe
    //String nome3="Nome 3"; //Não pode ter 2 variáveis local com o mesmo nome


    //Construtor
    public Teste(String nome2) {
        System.out.println(nome2);
        System.out.println(nome3);//Acesso a variável global
        //System.out.println(nome); //Não pode acessar "nome" fora do escopo
    }

    public void imprime_nome(String nome) {
        System.out.println(nome);
        System.out.println(nome3);//Acesso a variável global
    }

    public void imprime_nome_dois() {
        //System.out.println(nome); //Não pode acessar "nome" fora do escopo
        System.out.println(nome3);//Acesso a variável global
    }
    
    public void m1() {
        int x = 10;

        if (x>=10) {
            int y = 50;
            System.out.println(y);
        }
        // System.out.println(y); //Não pode acessar fora do escopo
        System.out.println(x);
    }

    
    

    public static void main(String[] args) {
        Teste t = new Teste("Nome 2");
        t.m1();
        t.imprime_nome("Nome 1");        
        t.nome3="Teste nome alterado";//Acessa no objeto, mas nunca faça assim, não é boa prática
        t.imprime_nome_dois();
        //System.out.println(nome3);//Não acessa fora do objeto
        Pessoa p = new Pessoa();
        System.out.println(">> Valor Original");
        System.out.println(p.id);

        System.out.println(">> Alterado o valor antes de criar um novo objeto");
        p.id=2;

        Pessoa p2 = new Pessoa();
        System.out.println(p2.id);

        System.out.println(">> Alterado o valor antes de chamar atravéz da classe");
        p.id=3;//perceba que alterei no primeiro objeto

        
        System.out.println(">> Posso acessar através da classe");
        System.out.println(Pessoa.id);

        System.out.println(">> Chamando o método estático");
        Pessoa.metodo();

        classeX x = new classeX();
        System.out.println(">> Shadowing");
        x.metodo();//mostra 20

        
    }

    
}