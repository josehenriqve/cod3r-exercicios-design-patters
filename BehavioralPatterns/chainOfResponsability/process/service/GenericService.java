package br.com.cod3r.exercicios.chainOfResponsability.process.service;

import br.com.cod3r.exercicios.chainOfResponsability.process.steps.ProcessStep;

public class GenericService {
	
	public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
		try {
			ProcessContext result = startProcess.execute(initialContext);
			return result.getProcessResult();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
