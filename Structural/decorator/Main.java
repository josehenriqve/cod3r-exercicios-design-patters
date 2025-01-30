package br.com.cod3r.exercicios.decorator;

import br.com.cod3r.exercicios.decorator.decorators.JScroolPane;
import br.com.cod3r.exercicios.decorator.model.JtextArea;

public class Main {
    public static void main(String[] args) {
        JtextArea jtextArea = new JtextArea();

        JScroolPane jScroolPane = new JScroolPane(jtextArea);

        jScroolPane.display();


    }
}
