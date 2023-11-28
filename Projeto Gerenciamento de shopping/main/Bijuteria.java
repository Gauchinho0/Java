package main;

public class Bijuteria extends Loja {
    private double metaVendas;

    //construtor 1
    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco e1, Data d1, double metaVendas, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1, estoqueProdutos);
        this.metaVendas = metaVendas;
    }

    // intanceof
    public Bijuteria () {
        super();
        this.metaVendas = metaVendas;
    }

    // Métodos de acesso para MetaVendas
    public double getMetaVendas () {
        return metaVendas;
    }

    public void setMetaVendas (double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Método toString atualizado
    @Override
    public String toString () {
        return super.toString() + "\nMeta de Vendas Mensais: " + metaVendas;
    }
}