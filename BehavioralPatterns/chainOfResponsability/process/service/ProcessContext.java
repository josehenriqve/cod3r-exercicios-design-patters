package br.com.cod3r.exercicios.chainOfResponsability.process.service;

import br.com.cod3r.exercicios.chainOfResponsability.process.model.Cliente;

public class ProcessContext {
	public Cliente cliente;
	private Object processResult;
	
	public ProcessContext(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addProcessResult(Object result) {
		this.processResult = result;
	}
	
	public Object getProcessResult() {
		return processResult;
	}
}
