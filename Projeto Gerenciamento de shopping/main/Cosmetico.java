package main;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    //construtor 1
    public Cosmetico (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco e1, Data d1, double taxaComercializacao, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1, estoqueProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //instanceof
    public Cosmetico () {
        super ();
        this.taxaComercializacao = taxaComercializacao;
    }

    // Métodos de acesso para TaxaComercializacao
    public double getTaxaComercializacao () {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao (double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Método toString atualizado
    @Override
    public String toString () {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}