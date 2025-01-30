package br.com.cod3r.exercicios.prototype.model;

public class Carregador implements Cloneable {
    private String cor;
    private String potencia;
    private Boolean isTurbo;
    private TipoCarregador tipoCarregador;

    public Carregador(String cor, String potencia, Boolean isTurbo, TipoCarregador tipoCarregador) {
        this.cor = cor;
        this.potencia = potencia;
        this.isTurbo = isTurbo;
        this.tipoCarregador = tipoCarregador;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public Boolean getTurbo() {
        return isTurbo;
    }

    public void setTurbo(Boolean turbo) {
        isTurbo = turbo;
    }

    public TipoCarregador getTipoCarregador() {
        return tipoCarregador;
    }

    public void setTipoCarregador(TipoCarregador tipoCarregador) {
        this.tipoCarregador = tipoCarregador;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Carregador [cor=" + cor + ", potencia=" + potencia+ ", isTurbo=" + isTurbo + ", tipoCarregador=" + tipoCarregador + "]";
    }
}
