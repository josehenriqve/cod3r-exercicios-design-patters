package br.com.cod3r.exercicios.chainOfResponsability.process.steps;

import br.com.cod3r.exercicios.chainOfResponsability.process.service.ProcessContext;

public class ValidateMandatoryField extends ProcessStep {

	public ValidateMandatoryField(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object field = context.cliente.getName();
		if(field == null) throw new Exception(String.format("%s is empty", args[0]));
		return next(context, true);
	}

}
