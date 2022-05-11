class Motor {
    int potencia;
}
class Carro {
    int ano;//Default 0
    char nome;//Default 0, no caso não mostra nada na tela
    boolean ligado;//Default false
    Motor motor;//Default null
    String cor;//Default null
    long chassi=12L;//Quando coloco o L ou l, ele é um long, minusculo ou maísculo
    Float velocidade=13F;//Quando coloco o F ou f, ele é um float, minusculo ou maísculo
    Double peso=14D;//Quando coloco o D ou d, ele é um double, minusculo ou maísculo
    int i = 0761;//Ao colocar o Zero na frente, esse é um numero octal de 0 a 7
    int x = 0xA;//Ao colocar o Zero e x ou X na frente, esse é um numero hexadecimal de 0 a 9 e a até F
    int y = 0b1010;//Ao colocar o Zero e y ou Y na frente, esse é um numero binario de 0 a 1
    double d = 3.1e2;//3.1 x 10^2 = 3.1 * 100 = 310
    float f = 3.1e2f;//3.1 x 10^2 = 3.1 * 100 = 310
    long l = 1_235_558_887l;//Apartir do Java 7 pode colocar underline para os numeros ficarem mais fácil de ler, somente entre números
    char c = 'a';//Posso colocar um caracter, entre aspas simples ou duplas
    char c2 = '\u0061';//Posso colocar um código unicode, entre aspas simples ou duplas
    char c3 = 65;//Posso colocar um número que representa a letra
    //Java é caseSensitive
    
}

public class Variaveis {
    public static void main(String[] args) {
        int[] vetor = new int[10];//Default 0
        System.out.println(vetor[0]);


        int idade;//Instancia a variavel com tipo e nome, não tem valor default
        //System.out.println(idade);//Não pode imprimir uma variavel não inicializada  

        if(args.length >10){
            idade = 20;
        }else{
            System.out.println("Teste");
            idade = 0;//Se não colocar esse valor dá erro de compilação
        }
        System.out.println(idade);//Imprime a variavel pois já foi inicializada


        idade = 10;//Inicializa a variavel
        System.out.println(idade);//Imprime a variavel pois já foi inicializada

        Carro carro = new Carro();
        System.out.println(carro.ano);//Compila quando é variavel membro, porque tem valor default
    }
}