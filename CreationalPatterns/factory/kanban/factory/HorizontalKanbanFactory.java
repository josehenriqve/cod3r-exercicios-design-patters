package br.com.cod3r.exercicios.factory.kanban.factory;

import br.com.cod3r.exercicios.factory.kanban.model.HorizontalKanban;
import br.com.cod3r.exercicios.factory.kanban.model.Kanban;

public class HorizontalKanbanFactory extends KanbanSimpleFactory {
    public HorizontalKanbanFactory() {}

    @Override
    protected Kanban createKanban() {
        return new HorizontalKanban();
    }
}
