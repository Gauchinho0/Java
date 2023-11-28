package main;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto (String nome, double preco, Data DataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = DataValidade;
    }

    // Getter e Setter
    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public double getPreco () {
        return preco;
    }

    public void setPreco (double precoproduto) {
        this.preco = precoproduto;
    }

    public Data getDataValidade () {
        return dataValidade;
    }

    public void setDataValidade (Data DataValidade) {
        this.dataValidade = DataValidade;
    }

    public boolean estaVencido (Data dataAtual) {
        if (dataAtual.getAno() > this.dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == this.dataValidade.getAno() && dataAtual.getMes() > this.dataValidade.getMes()) {
            return true;
        } else if (dataAtual.getMes() == this.dataValidade.getMes() && dataAtual.getDia() >= this.dataValidade.getDia()) {
            return true;
        } else {
            return false;
        }
    }

    // Método toString atualizado
    @Override
    public String toString () {
        return "Nome do Produto: " + getNome() + "\nPreco: R$ " + getPreco() + "\nValidade: " + getDataValidade();
    }

}
