package br.com.cod3r.exercicios.command.migration.decorators;

import br.com.cod3r.exercicios.command.migration.model.GenericTable;
import br.com.cod3r.exercicios.command.migration.model.Table;

import java.util.List;

public class AddNewColumn extends TableDecorator {

    private String tableName;

    private List<String> columns;

    private List<String> rows;

    public AddNewColumn(GenericTable decoratedTable) {
        super(decoratedTable);
    }

    public void addColumn(String columnName) {
        columns.add(columnName);
    }

    public void addRow(String rowValue) {
        rows.add(rowValue);
    }

    @Override
    public List<String> getColumn() {
        return columns;
    }

    @Override
    public List<String> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTableName()).append(": [ ").append("\n");
        for (int i = 0; i < rows.size(); i++) {
            if (i < columns.size()) {
                sb.append(columns.get(i)).append(" = ").append(rows.get(i)).append(" ");
            }
            if (i == rows.size() - 1) {
                sb.append("]\n");
            }
        }
        return sb.toString();
    }
}
