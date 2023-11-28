package main;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    //construtor 1
    public Vestuario (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco e1, Data d1, boolean produtosImportados, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1, estoqueProdutos);
        this.produtosImportados = produtosImportados;
    }

    //construtor 2
    public Vestuario () {
        super();
        this.produtosImportados = produtosImportados;
    }

    // Métodos de acesso para produtosImportados
    public boolean getProdutosImportados () {
        return produtosImportados;
    }

    public void setProdutosImportados (boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Método toString atualizado
    @Override
    public String toString () {
        return super.toString() + "\nProdutos Importados: " + produtosImportados;
    }
}
