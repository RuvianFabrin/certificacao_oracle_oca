package financeiro;

import modelo.*;//Deve ser importado quando não está no mesmo pacote
//import static modelo.Util.TAMANHO;
//import static modelo.Util.maior;
import static modelo.Util.*;//Posso importar tudo que é estatico de uma vez também


//import java.util.*;
import java.sql.Date;
//import br.com.ruvian.certificacao.*;//Quando você coloca o *, ele importa todos os tipos de classes

public class Pedido {
    //modelo.Quadrado quadrado;//Não pode, tem que importar o pacote
    //dao.ProdutoDao produtoDao;//Não pode, tem que importar o pacote
    //Pessoa cliente;
    Endereco endereco;
    Date dataDeCriacao = new Date(System.currentTimeMillis());//Pega do import java.sql.Date
    //Produto produto;//Você nunca pode acessar um objeto do pacote default

    /*public Pessoa getCliente(){
        return cliente;
    }*/

    public void calculaTudo() {
        //int t = modelo.Util.TAMANHO;
        //modelo.Util.maior(3, 10);
        int t = TAMANHO;
        maior(3, t);
    }
}
