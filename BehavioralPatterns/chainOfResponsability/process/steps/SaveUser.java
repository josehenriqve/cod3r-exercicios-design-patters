package br.com.cod3r.exercicios.chainOfResponsability.process.steps;

import br.com.cod3r.exercicios.chainOfResponsability.process.repository.UserRepository;
import br.com.cod3r.exercicios.chainOfResponsability.process.service.ProcessContext;

import java.util.HashMap;
import java.util.Map;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = new HashMap<String, Object>();
		userInput.put("name", context.cliente.getName());
		userInput.put("email", context.cliente.getEmail());
		userInput.put("password", context.cliente.getPassWord());
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
