import javax.swing.*;
import Cadastros.Clientes;
import Cadastros.Produtos;

public class ProgramaView {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame janela = new JFrame("Programa");
        janela.setSize(1600, 900);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar o menu suspenso de cadastros
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastros = new JMenu("Cadastros");
        JMenuItem menuItemClientes = new JMenuItem("Clientes");
        JMenuItem menuItemProdutos = new JMenuItem("Produtos");
        menuCadastros.add(menuItemClientes);
        menuCadastros.add(menuItemProdutos);
        menuBar.add(menuCadastros);

        //Criar menu suspenso de vendas
        JMenu menuVendas = new JMenu("Vendas");
        JMenuItem menuItemVendas = new JMenuItem("Vender");
        menuVendas.add(menuItemVendas);
        menuBar.add(menuVendas);

        //Criar menu suspenso de relatórios
        JMenu menuRelatorios = new JMenu("Relatórios (a desenvolver)");
        JMenuItem menuItemClientesRelatorio = new JMenuItem("Clientes");
        JMenuItem menuItemProdutosRelatorio = new JMenuItem("Produtos");
        menuRelatorios.add(menuItemClientesRelatorio);
        menuRelatorios.add(menuItemProdutosRelatorio);
        menuBar.add(menuRelatorios);

        // Adicionar o menu suspenso à janela
        janela.setJMenuBar(menuBar);

        // Exibir a janela
        janela.setVisible(true);

        menuItemClientes.addActionListener(e -> {
            // Criar a janela de cadastro de clientes
            JFrame janelaClientes = new JFrame("Cadastro de Clientes");
            janelaClientes.setSize(1024, 600);

            // Criar os campos de texto e outros componentes
            JLabel labelNome = new JLabel("Nome:");
            JTextField campoNome = new JTextField();
            JCheckBox checkboxEmpresa = new JCheckBox("Empresa");
            JLabel labelDataNascimento = new JLabel("Data de Nascimento:");
            JTextField campoDataNascimento = new JTextField();
            JLabel labelNumeroContato = new JLabel("Número de Contato:");
            JTextField campoNumeroContato = new JTextField();
            JLabel labelCPFCNPJ = new JLabel("CPF/CNPJ:");
            JTextField campoCPFCNPJ = new JTextField();
            JLabel labelVencimentoCrediario = new JLabel("Vencimento Crediário:");
            JTextField campoVencimentoCrediario = new JTextField();
            JLabel labelObservacao = new JLabel("Observação:");
            JTextField campoObservacao = new JTextField();

            // Criar os botões "Salvar" e "Cancelar"
            JButton botaoSalvar = new JButton("Salvar");
            botaoSalvar.addActionListener(e2 -> {
                // Criar um objeto da classe Clientes
                Clientes cliente = new Clientes(campoNome.getText(), campoDataNascimento.getText(), campoNumeroContato.getText(), campoCPFCNPJ.getText(), campoVencimentoCrediario.getText(), campoObservacao.getText(), checkboxEmpresa.isSelected());
                // Salvar o cliente
                cliente.salvarCliente();
                JOptionPane.showMessageDialog(janelaClientes, "Cliente salvo com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            });
            

            JButton botaoCancelar = new JButton("Sair");
            botaoCancelar.addActionListener(e2 -> {
                janelaClientes.dispose();
            });
            
            JButton botaoLista = new JButton("Listar");
            botaoLista.addActionListener(e2 -> {
                // Listar os clientes em um arquivo de texto
                Clientes cliente = new Clientes("", "", "", "", "", "", false);
                cliente.listaClientes();


            });

            // Posicionar os componentes na janela
            GroupLayout layout = new GroupLayout(janelaClientes.getContentPane());
            janelaClientes.getContentPane().setLayout(layout);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(labelNome)
                .addComponent(labelDataNascimento)
                .addComponent(labelNumeroContato)
                .addComponent(labelCPFCNPJ)
                .addComponent(labelVencimentoCrediario)
                .addComponent(labelObservacao))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(campoNome)
                .addComponent(campoDataNascimento)
                .addComponent(campoNumeroContato)
                .addComponent(campoCPFCNPJ)
                .addComponent(campoVencimentoCrediario)
                .addComponent(campoObservacao)
                .addComponent(checkboxEmpresa))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(botaoSalvar)
                .addComponent(botaoCancelar)
                .addComponent(botaoLista)));


            layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNome)
                .addComponent(campoNome))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelDataNascimento)
                .addComponent(campoDataNascimento))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNumeroContato)
                .addComponent(campoNumeroContato))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelCPFCNPJ)
                .addComponent(campoCPFCNPJ))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelVencimentoCrediario)
                .addComponent(campoVencimentoCrediario))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelObservacao)
                .addComponent(campoObservacao))
            .addComponent(checkboxEmpresa)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botaoSalvar)
                .addComponent(botaoCancelar)
                .addComponent(botaoLista)));

            // Exibir a janela de cadastro de clientes
            janelaClientes.setVisible(true);
        });
        menuItemProdutos.addActionListener(e -> {
            // Criar a janela de cadastro de produtos
            JFrame janelaProdutos = new JFrame("Cadastro de Produtos");
            janelaProdutos.setSize(1024, 600);

            // Criar os campos de texto e outros componentes
            JLabel labelCodigo = new JLabel("Código:");
            JTextField campoCodigo = new JTextField();
            JLabel labelProduto = new JLabel("Produto:");
            JTextField campoProduto = new JTextField();
            JLabel labelPreco = new JLabel("Preço:");
            JTextField campoPreco = new JTextField();
            JLabel labelObservacao = new JLabel("Observação:");
            JTextField campoObservacao = new JTextField();

            // Criar os botões "Salvar" e "Cancelar"
            JButton botaoSalvar = new JButton("Salvar");
            botaoSalvar.addActionListener(e2 -> {
                // Validar os campos
                String codigoText = campoCodigo.getText();
                String precoText = campoPreco.getText();
                
                try {
                    int codigo = Integer.parseInt(codigoText);
                    double preco = Double.parseDouble(precoText);
                    
                    // Criar um objeto da classe Produtos
                    Produtos produto = new Produtos(codigo, campoProduto.getText(), preco, 0, campoObservacao.getText());
                    // Salvar o produto
                    produto.salvarProduto();
                } catch (NumberFormatException ex) {
                    // Exibir mensagem de erro na tela
                    JOptionPane.showMessageDialog(janelaProdutos, "Erro: Código deve ser um número inteiro e Preço deve ser um número válido.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            });
            JButton botaoCancelar = new JButton("Sair");

            // Posicionar os componentes na janela
            GroupLayout layout = new GroupLayout(janelaProdutos.getContentPane());
            janelaProdutos.getContentPane().setLayout(layout);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(labelCodigo)
                .addComponent(labelProduto)
                .addComponent(labelPreco)
                .addComponent(labelObservacao))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(campoCodigo)
                .addComponent(campoProduto)
                .addComponent(campoPreco)
                .addComponent(campoObservacao))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(botaoSalvar)
                .addComponent(botaoCancelar)));

            layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelCodigo)
                .addComponent(campoCodigo))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelProduto)
                .addComponent(campoProduto))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelPreco)
                .addComponent(campoPreco))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelObservacao)
                .addComponent(campoObservacao))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botaoSalvar))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botaoCancelar)));

            // Exibir a janela de cadastro de produtos
            janelaProdutos.setVisible(true);

        });

        menuItemVendas.addActionListener(e -> {
            // Criar a janela de vendas
            JFrame janelaVendas = new JFrame("Vendas");
            janelaVendas.setSize(1024, 600);

            // Criar os campos de texto e outros componentes
            JLabel labelCliente = new JLabel("Cliente:");
            JTextField campoCliente = new JTextField();
            JLabel labelProduto = new JLabel("Produto:");
            JTextField campoProduto = new JTextField();
            JLabel labelQuantidade = new JLabel("Quantidade:");
            JTextField campoQuantidade = new JTextField();

            // Criar os botões "Vender" e "Cancelar"
            JButton botaoVender = new JButton("Vender");
            botaoVender.addActionListener(e2 -> {
            // Validar os campos
            String quantidadeText = campoQuantidade.getText();
            
            try {
                int quantidade = Integer.parseInt(quantidadeText);
                // Realizar a venda
                // ...
            } catch (NumberFormatException ex) {
                // Exibir mensagem de erro na tela
                JOptionPane.showMessageDialog(janelaVendas, "Erro: Quantidade deve ser um número inteiro.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }
            });
            JButton botaoCancelar = new JButton("Cancelar");

            // Posicionar os componentes na janela
            GroupLayout layout = new GroupLayout(janelaVendas.getContentPane());
            janelaVendas.getContentPane().setLayout(layout);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(labelCliente)
            .addComponent(labelProduto)
            .addComponent(labelQuantidade))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(campoCliente)
            .addComponent(campoProduto)
            .addComponent(campoQuantidade))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(botaoVender)
            .addComponent(botaoCancelar)));

            layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(labelCliente)
            .addComponent(campoCliente))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(labelProduto)
            .addComponent(campoProduto))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(labelQuantidade)
            .addComponent(campoQuantidade))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(botaoVender))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(botaoCancelar)));

            // Exibir a janela de vendas
            janelaVendas.setVisible(true);
        });
    
    }
}
