package br.com.cod3r.exercicios.decorator.decorators;

import br.com.cod3r.exercicios.decorator.model.Component;


public class JScroolPane extends ComponentDecorator{


    public JScroolPane(Component component) {
        super(component);
    }

    @Override
    public void display() {
        component.display();
        System.out.println("JScroolPane added");
    }
}
