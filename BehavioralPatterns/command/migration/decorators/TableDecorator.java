package br.com.cod3r.exercicios.command.migration.decorators;

import br.com.cod3r.exercicios.command.migration.model.Table;

import java.util.List;

public abstract class TableDecorator implements Table {
    protected Table decoratedTable;

    public TableDecorator(Table decoratedTable) {
        this.decoratedTable = decoratedTable;
    }

    @Override
    public String getTableName() {
        return decoratedTable.getTableName();
    }

    @Override
    public List<String> getColumn() {
        return decoratedTable.getColumn();
    }

    @Override
    public List<String> getRows() {
        return decoratedTable.getRows();
    }
}

