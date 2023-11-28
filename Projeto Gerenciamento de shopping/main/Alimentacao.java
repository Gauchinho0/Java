package main;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    //construtor 1
    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco e1, Data d1, Data dataAlvara, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1, estoqueProdutos);
        this.dataAlvara = dataAlvara;
    }

    // intanceof
    public Alimentacao () {
        super();
        this.dataAlvara = dataAlvara;
    }

    // Métodos de acesso para dataAlvara
    public Data getDataAlvara () {
        return dataAlvara;
    }

    public void setDataAlvara (Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Método toString atualizado
    @Override
    public String toString () {
        return super.toString() + "\nData do Alvará de Funcionamento: " + dataAlvara;
    }
}
