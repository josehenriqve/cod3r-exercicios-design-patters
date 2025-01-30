package br.com.cod3r.exercicios.bridge.pagamento;

import br.com.cod3r.exercicios.bridge.model.Compra;

public class Pix implements Pagamento{

    @Override
    public void efetuarPagamento(Compra compra) {
        if (conectPixServer()){
            System.out.println("Pagamento efetuado com sucesso");
            System.out.println("Comprovante pix");
            System.out.println("Valor total ="+compra.getValorTotal());
        }
    }

    private boolean conectPixServer(){
        boolean isAvaiableServer = true;

        return isAvaiableServer;
    }
}
