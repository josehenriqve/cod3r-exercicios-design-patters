package br.com.cod3r.exercicios.factory.kanban.factory;

import br.com.cod3r.exercicios.factory.kanban.model.Kanban;

public abstract class KanbanSimpleFactory {

    public Kanban buildKanban() {
        Kanban kanban = null;
        kanban = createKanban();
        kanban.getName();
        return kanban;
    }

    protected abstract Kanban createKanban();
}
