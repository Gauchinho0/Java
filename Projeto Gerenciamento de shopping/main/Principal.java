package main;

public class Principal{
public static void main (String[] args) throws InterruptedException {

        Teclado teclado = new Teclado();
        Loja loja = null;
        Produto produto = null;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("----Menu----");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção:");

            opcao = teclado.leInt();


            switch (opcao) {
                case 1:
                    // Criação da loja
                    System.out.println("\n----Criar Loja----");
                    String nomeLoja = Teclado.leString("Digite o nome da loja: ");
                    int quantidaFuncionarios = Teclado.leInt("Digite a quantidade de funcionarios: ");
                    int tamanhoEstoque = Teclado.leInt("Digite o tamanho do estoque: ");

                    // Criação do endereço
                    Endereco endereco;
                    endereco = new Endereco ("nomeDaRua", "cidade", "estado",  "pais",  "cep",  "numero",  "complemento");
                    endereco.setNomeDaRua(Teclado.leString("Digite o nome da rua: "));
                    endereco.setCidade(Teclado.leString("Digite o nome da cidade: "));
                    endereco.setEstado(Teclado.leString("Digite o nome do estado: "));
                    endereco.setPais(Teclado.leString("Digite o nome do país: "));
                    endereco.setCep(Teclado.leString("Digite o cep: "));
                    endereco.setNumero(teclado.leString("digite o Numero: "));
                    endereco.setComplemento(Teclado.leString("Digite o complemento: "));

                    // Criação da data de fundação
                    Data dataDeFundacao = new Data(Teclado.leInt("Digite o dia de fundação: "),
                            Teclado.leInt("Digite o mês de fundação: "),
                            Teclado.leInt("Digite o ano de fundação: "));

                    loja = new Loja(nomeLoja, quantidaFuncionarios, endereco, dataDeFundacao, tamanhoEstoque);
                    System.out.println("Loja criada com sucesso!\n");
                    break;

                case 2:

                    // Criação do Produto
                    System.out.println("\n----Criar Produto----");
                    String nomeProduto = Teclado.leString("Digite o nome do produto: ");
                    double precoProduto = Teclado.leDouble("Digite o preço do produto: ");

                    // Criação da data de validade
                    Data dataValidade = new Data(Teclado.leInt("Digite o dia de validade: "),
                            Teclado.leInt("Digite o mês de validade: "),
                            Teclado.leInt("Digite o ano de validade: "));

                    // Criar o objeto produto após a entrada da data de validade
                    produto = new Produto(nomeProduto, precoProduto, dataValidade);

                    // Verificar se o produto está vencido
                    String msgVencido = " PRODUTO " + (produto.estaVencido(new Data(20, 10, 2023)) ? "" : "NÃO ") + "VENCIDO";
                    System.out.println(msgVencido);

                    System.out.println("Produto criado com sucesso!\n");

                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}


