package Cadastros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Clientes {
    private String nome;
    private String dataNascimento;
    private String numeroContato;
    private String CPFCNPJ;
    private String vencimentoCrediario;
    private String observacao;
    private boolean empresa;

    public Clientes(String nome, String dataNascimento, String numeroContato, String CPFCNPJ, String vencimentoCrediario, String observacao, boolean empresa) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroContato = numeroContato;
        this.CPFCNPJ = CPFCNPJ;
        this.vencimentoCrediario = vencimentoCrediario;
        this.observacao = observacao;
        this.empresa = empresa;
    }

    public void salvarCliente() {
        try {
            FileWriter arquivo = new FileWriter("clientes.txt", true);
            arquivo.write(nome + ";" + dataNascimento + ";" + numeroContato + ";" + CPFCNPJ + ";" + vencimentoCrediario + ";" + observacao + ";" + empresa + "\n");
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listaClientes() {
        //Listar clientes com base no arquivo de texto
        try {
            FileReader arquivo = new FileReader("clientes.txt");
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
            while (linha != null) {
                String[] dados = linha.split(";");
                System.out.println("Nome: " + dados[0]);
                System.out.println("Data de Nascimento: " + dados[1]);
                System.out.println("Número de Contato: " + dados[2]);
                System.out.println("CPF/CNPJ: " + dados[3]);
                System.out.println("Vencimento do Crediário: " + dados[4]);
                System.out.println("Observação: " + dados[5]);
                System.out.println("Empresa: " + dados[6]);
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();

    }
}
}

