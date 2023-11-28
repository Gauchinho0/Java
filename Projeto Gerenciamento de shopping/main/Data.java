package main;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Constructor 1

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        dataValida();
    }

    // Métodos de Getter e Setters
    private void dataValida () {
        boolean dataValida = true;

        if (mes < 1 || mes > 12) {
            dataValida = false;
        } else if (dia < 1 || dia > mes) {
            dataValida = false;
        }

        if (!dataValida(dia, mes, ano)) {
            System.out.println("Data inválida. Usando 01/01/2000.");
            dia = 1;
            mes = 1;
            ano = 2000;

        }
    }

    public int getDia () {
        return dia;
    }

    public void setDia (int dia) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
        }
        else {
            System.out.println("Data inválida. Não foi possível alterar o dia.");
        }
    }

    public int getMes () {
        return mes;
    }

    public void setMes (int mes) {
        if (dataValida(dia, mes, ano)) {
            this.mes = mes;
        } else
            System.out.println("Data inválida. Não foi possível alterar o mês.");
    }


    public int getAno () {
        return ano;
    }

    public void setAno (int ano) {
        if (dataValida(dia, mes, ano)) {
            this.ano = ano;
        } else
            System.out.println("Data inválida. Não foi possivel alterar o ano");
    }

    public boolean verificaAnoBissexto () {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true; // É bissexto
        } else {
            return false; // Não é bissexto
        }
    }

    private boolean dataValida (int dia, int mes, int ano) {
        if (this.mes == 2) {
            // Verifica se o mês é fevereiro
            return (verificaAnoBissexto() ? dia <= 29 : dia <= 28);
        } else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            // Verifica meses com 30 dias
            return dia <= 30;
        } else {
            // Meses com 31 dias
            return dia <= 31;
        }
    }

    private boolean validaMes (int mes) {
        return mes >= 1 && mes <= 12;
    }

    // Método toString atualizado

    public String toString () {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
