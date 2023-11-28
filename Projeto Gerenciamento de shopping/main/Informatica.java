package main;

public class Informatica extends Loja {
    private double seguroEletronicos;

    //construtor 1
    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco e1, Data d1, double seguroEletronico, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    //construtor 2
    public Informatica () {
        super();
        this.seguroEletronicos = seguroEletronicos;
    }

    // Métodos de acesso para SeguroEletronico
    public double getSeguroEletronicos () {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos (double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Método toString atualizado
    @Override
    public String toString () {
        return super.toString() + "\nSeguro de Eletrônicos: R$" + seguroEletronicos;
    }
}
