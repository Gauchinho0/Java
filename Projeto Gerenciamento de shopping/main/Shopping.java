package main;

import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor 1
    public Shopping (String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    // Métodos getter e setters
    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco () {
        return endereco;
    }

    public void setEndereco (Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas () {
        return lojas;
    }

    public boolean insereLoja (Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false; // Não há espaço para mais lojas
    }

    public boolean removeLoja (String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja não encontrada
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        // Variável para contar a quantidade de lojas do tipo especificado
        int quantidade = 0;

        // Verifica o tipo de loja desejado e cria uma instância correspondente
        Loja tipoLojaObj = null;
        switch (tipoLoja) {
            case "Cosmético":
                tipoLojaObj = new Cosmetico();
                break;
            case "Vestuário":
                tipoLojaObj = new Vestuario();
                break;
            case "Bijuteria":
                tipoLojaObj = new Bijuteria();
                break;
            case "Alimentação":
                tipoLojaObj = new Alimentacao();
                break;
            case "Informática":
                tipoLojaObj = new Informatica();
                break;
            default:
                return -1; // Retorna -1 para tipos não reconhecidos
        }

        // Itera pelas lojas e verifica se o tipo da loja corresponde ao tipo desejado
        for (Loja loja : lojas) {
            if (loja.getClass() == tipoLojaObj.getClass()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro () {
        Loja lojaMaisCara = null;
        double valorMaisAlto = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {
                if (informatica.getSeguroEletronicos() > valorMaisAlto) {
                    valorMaisAlto = informatica.getSeguroEletronicos();
                    lojaMaisCara = loja;
                }
            }
        }
        return (Informatica) lojaMaisCara;
    }


    // Método toString atualizado
    @Override
    public String toString() {
        return "Shopping Center " + nome + "\nLocalizado no endereço: " + endereco + "\nLojas: " + Arrays.toString(lojas) + "]";
    }

}
