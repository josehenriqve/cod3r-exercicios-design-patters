package br.com.cod3r.exercicios.factory.kanban.factory;

import br.com.cod3r.exercicios.factory.kanban.model.Kanban;
import br.com.cod3r.exercicios.factory.kanban.model.VerticalKanban;

public class VerticalKanbanFactory extends KanbanSimpleFactory {

    @Override
    protected Kanban createKanban() {
        return new VerticalKanban();
    }
}
