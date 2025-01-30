package br.com.cod3r.exercicios.command;

import br.com.cod3r.exercicios.command.migration.MigrationTool;
import br.com.cod3r.exercicios.command.migration.commands.MigrationCommand;
import br.com.cod3r.exercicios.command.migration.commands.ProductTable;
import br.com.cod3r.exercicios.command.migration.model.GenericTable;

public class Client {

	public static void main(String[] args) {

		GenericTable genericTable = new GenericTable
				.CreateTable("teste 2")
				.withColumns("nome", "idade","email")
				.withValues("jose","32","teste@email.com").now();


		MigrationTool migrationTool = new MigrationTool();
		migrationTool.addMigration(new ProductTable(genericTable));

		migrationTool.latest();
		System.out.println(genericTable);
	}
}
