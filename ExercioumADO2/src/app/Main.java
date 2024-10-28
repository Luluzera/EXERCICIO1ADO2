package app;

import facade.Facade;
import model.Cliente;
import model.Endereco;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Principal", 123);
        Produto produto1 = new Produto("Produto A", "Categoria 1", 10.5);
        Produto produto2 = new Produto("Produto B", "Categoria 2", 15.0);

        Cliente cliente = new Cliente("João", endereco);
        cliente.getLista().add(produto1);
        cliente.getLista().add(produto2);

        Facade facade = Facade.getInstance();
        facade.exibirInformacoesCliente(cliente);
    }
}
