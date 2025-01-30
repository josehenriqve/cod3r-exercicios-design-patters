package br.com.cod3r.exercicios.chainOfResponsability.process;

import br.com.cod3r.exercicios.chainOfResponsability.process.model.Cliente;
import br.com.cod3r.exercicios.chainOfResponsability.process.service.GenericService;
import br.com.cod3r.exercicios.chainOfResponsability.process.service.ProcessContext;
import br.com.cod3r.exercicios.chainOfResponsability.process.service.ServicesChain;

public class Client {

	public static void main(String[] args) {

		Cliente cliente = new Cliente.Builder("Jose")
				.withEmail("tesx4@gmail.com")
				.withPassWord("j98123aa")
				.build();

		ProcessContext ctx = new ProcessContext(cliente);

		Object response = GenericService.run(ServicesChain.saveUserProcess, ctx);

		System.out.println(response);
	}
}
