package Cadastros;

import java.io.FileWriter;
import java.io.IOException;

public class Vendas {
    private int codigo;
    private String data;
    private String hora;
    private int codigoCliente; // Add a new field to store the client code
    private String produto;
    private int quantidade;
    private double valorTotal;

    public Vendas(int codigo, String data, String hora, int codigoCliente, String produto, int quantidade, double valorTotal) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.codigoCliente = codigoCliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public void salvarVenda() {
        // Save the sale in a text file and validate fields. If it is not possible to save, display an error message on the screen for the user.
        try {
            FileWriter arquivo = new FileWriter("vendas.txt", true);
            arquivo.write(codigo + ";" + data + ";" + hora + ";" + codigoCliente + ";" + produto + ";" + quantidade + ";" + valorTotal + "\n");
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Code to be executed regardless of whether an exception occurred or not.
        }
    }

    public void exibirVenda() {
        System.out.println("Código: " + codigo);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Código do Cliente: " + codigoCliente);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: " + valorTotal);
    }

    

    
}
