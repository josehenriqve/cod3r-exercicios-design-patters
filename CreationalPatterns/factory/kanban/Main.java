package br.com.cod3r.exercicios.factory.kanban;

import br.com.cod3r.exercicios.factory.kanban.factory.HorizontalKanbanFactory;
import br.com.cod3r.exercicios.factory.kanban.factory.KanbanSimpleFactory;
import br.com.cod3r.exercicios.factory.kanban.factory.VerticalKanbanFactory;
import br.com.cod3r.exercicios.factory.kanban.model.Kanban;

public class Main {
    public static void main(String[] args) {
        KanbanSimpleFactory kanbanHFactory = new HorizontalKanbanFactory();
        KanbanSimpleFactory kanbanVFactory = new VerticalKanbanFactory();

        Kanban firstKanban = kanbanHFactory.buildKanban();
        Kanban secondKanban = kanbanVFactory.buildKanban();

    }
}
