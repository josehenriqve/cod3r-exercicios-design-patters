package br.com.cod3r.exercicios.adpter;

import br.com.cod3r.exercicios.adpter.model.Envelop;
import br.com.cod3r.exercicios.adpter.model.JSON;
import br.com.cod3r.exercicios.adpter.model.XML;
import br.com.cod3r.exercicios.adpter.model.adapters.XMLToJSONAdapter;

public class Main {
    public static void sendEnvelop(Envelop envelop) {
        System.out.println("Email para: " + envelop.getEmail()+" >> enviado com sucesso!!<<");
        System.out.println("Body: " + envelop.getCorpo()+" >> enviado com sucesso!!<<");
    }


    public static void main(String[] args) {

        Envelop envelop = new Envelop.Builder(1, "j@jo.com")
                .andAnexo("anexo1")
                .andNome("nome")
                .andTitulo("envelop teste")
                .build(new XMLToJSONAdapter(new XML("Jos22e","1.0","UTF-8")));


        sendEnvelop(envelop);
    }
}
