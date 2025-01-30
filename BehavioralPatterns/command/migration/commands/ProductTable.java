package br.com.cod3r.exercicios.command.migration.commands;

import br.com.cod3r.exercicios.command.migration.model.GenericTable;

public class ProductTable extends MigrationCommand {
	
	public ProductTable(GenericTable database) {
		super(database);
	}

	@Override
	public void execute() {
		GenericTable genericTable = new GenericTable
				.CreateTable("Cliente")
				.withColumns("nome", "idade","email")
				.withValues("jose","32","teste@email.com").now();
		database = genericTable;
	}

	@Override
	public void undo() {
		database = null;
	}

}
