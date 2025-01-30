package br.com.cod3r.exercicios.bridge.pagamento;

import br.com.cod3r.exercicios.bridge.model.Compra;

public interface Pagamento {
    void efetuarPagamento(Compra compra);
}
