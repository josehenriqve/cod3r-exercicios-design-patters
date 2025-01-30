package br.com.cod3r.exercicios.command.migration.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTable implements Table {

    private List<String> columns;

    private List<String> rows;

    private String tableName;


    private GenericTable(String tableName, List<String> columns, List<String>rows) {
        this.columns = columns;
        this.rows = rows;
        this.tableName = tableName;
    }

    public GenericTable() {}

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(tableName).append(": [ ").append("\n");
        for(int i=0; i<rows.size(); i++){
            sb.append(columns.get(i)).append(" = ").append(rows.get(i)).append(" ");
            if (i == rows.size()-1){
                sb.append("]\n");
            }
        }

        return sb.toString();
    }

    @Override
    public String getTableName() {
        return this.tableName;
    }

    @Override
    public List<String> getColumn() {
        return this.getRows();
    }

    @Override
    public List<String> getRows() {
        return this.rows;
    }

    public static class CreateTable {

        private List<String> columns;

        private List<String> rows;

        private String tableName;

        public CreateTable(String tableName) {
            this.tableName = tableName;
        }

        public CreateTable withColumns(String... column) {
            this.columns = new ArrayList<>(Arrays.asList(column));
            return this;
        }

        public CreateTable withValues(String... column) {
            List<String> listOfRows = new ArrayList<>(Arrays.asList(column));
            if (listOfRows.size() != columns.size()) {
                throw new IllegalArgumentException("The number of rows and columns do not match");
            }
            this.rows = listOfRows;
            return this;
        }

        public GenericTable now() {
            return new GenericTable(tableName, new ArrayList<>(this.columns), new ArrayList<>(this.rows));
        }

    }
}
