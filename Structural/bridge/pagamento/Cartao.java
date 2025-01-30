package br.com.cod3r.exercicios.bridge.pagamento;


import br.com.cod3r.exercicios.bridge.model.Compra;

public class Cartao implements Pagamento {

    @Override
    public void efetuarPagamento(Compra compra) {
        if (conectCartaoServer()){
            System.out.println("Pagamento efetuado com sucesso");
            System.out.println("Comprovante pagamento via cartao");
            System.out.println("Valor total ="+compra.getValorTotal());
        }
    }

    private boolean conectCartaoServer(){
        boolean isAvaiableServer = true;
        return isAvaiableServer;
    }
}
