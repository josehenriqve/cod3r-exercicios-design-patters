package br.com.cod3r.exercicios.command.migration.commands;

import br.com.cod3r.exercicios.command.migration.model.GenericTable;

public abstract class MigrationCommand {
	protected GenericTable database;
	
	public MigrationCommand(GenericTable database) {
		this.database = database;
	}
	
	public abstract void execute();
	public abstract void undo();
}
