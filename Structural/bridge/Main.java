package br.com.cod3r.exercicios.bridge;

import br.com.cod3r.exercicios.bridge.model.Compra;
import br.com.cod3r.exercicios.bridge.model.ItemCompra;
import br.com.cod3r.exercicios.bridge.model.Shopping;
import br.com.cod3r.exercicios.bridge.pagamento.Cartao;
import br.com.cod3r.exercicios.bridge.pagamento.Pagamento;
import br.com.cod3r.exercicios.bridge.pagamento.Pix;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            System.out.println("Comprando no shopping");

            ItemCompra joiaCara = new ItemCompra();
            joiaCara.setValor(900.00);
            joiaCara.setNome("joia cara");

            ItemCompra roupaBarata = new ItemCompra();
            roupaBarata.setValor(100.00);
            roupaBarata.setNome("Camisa");

            List<ItemCompra> compras = new ArrayList<>();
            compras.add(joiaCara);
            compras.add(roupaBarata);

            Compra compra = new Shopping();
            compra.adicionarItensItem(compras);

            System.out.println("Pagando via pix");

            Pagamento pagamento = new Pix();
            pagamento.efetuarPagamento(compra);

            System.out.println("Pagando via Cartao");

            Pagamento pagamento2 = new Cartao();
            pagamento.efetuarPagamento(compra);

    }
}
