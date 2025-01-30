package br.com.cod3r.exercicios.adpter.model.adapters;

import br.com.cod3r.exercicios.adpter.model.JSON;
import br.com.cod3r.exercicios.adpter.model.XML;

public class XMLToJSONAdapter extends JSON {
        private XML xml;

        public XMLToJSONAdapter(XML xml) {
            System.out.println("CONVERTED XML");
            this.xml = xml;
        }

        @Override
        public String toJson() {
            return "{\"data\":\"" + xml.getData() + "\"}";
        }

}
