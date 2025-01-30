package br.com.cod3r.exercicios.decorator.decorators;

import br.com.cod3r.exercicios.decorator.model.Component;

public abstract class ComponentDecorator implements Component {

    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
}
