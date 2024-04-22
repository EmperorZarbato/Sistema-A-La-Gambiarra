package Cadastros;

import java.io.FileWriter;
import java.io.IOException;

public class Produtos {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private String descricao;

    public Produtos(int codigo, String nome, double preco, int quantidade, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public void salvarProduto() {
        // Salvar o produto em um arquivo de texto e validar campos. Caso não seja possível salvar, exibir uma mensagem de erro na tela para o usuário.
        try {
            FileWriter arquivo = new FileWriter("produtos.txt", true);
            arquivo.write(codigo + ";" + nome + ";" + preco + ";" + quantidade + ";" + descricao + "\n");
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
    

