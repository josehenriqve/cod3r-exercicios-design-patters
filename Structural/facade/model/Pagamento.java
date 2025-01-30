package br.com.cod3r.exercicios.facade.model;

public class Pagamento implements Model{

    private int id;

    private String descricao;

    private double valor;

    public Pagamento(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    @Override
    public String print() {
        return "id"+id+"\ndescricao"+descricao+"\nvalor"+valor;
    }
}
