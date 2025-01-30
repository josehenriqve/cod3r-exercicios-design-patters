package br.com.cod3r.exercicios.command.migration.model;

import java.util.List;

public interface Table {

    public String getTableName();

    public List<String> getColumn();

    public List<String> getRows();

}
