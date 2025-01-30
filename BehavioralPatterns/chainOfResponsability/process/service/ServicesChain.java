package br.com.cod3r.exercicios.chainOfResponsability.process.service;

import br.com.cod3r.exercicios.chainOfResponsability.process.steps.ProcessStep;
import br.com.cod3r.exercicios.chainOfResponsability.process.steps.SaveUser;
import br.com.cod3r.exercicios.chainOfResponsability.process.steps.ValidateMandatoryField;
import br.com.cod3r.exercicios.chainOfResponsability.process.steps.VerifyPassWord;

public class ServicesChain {
	
	public static ProcessStep saveUserProcess = buildChain(
			new ValidateMandatoryField("name"),
			new ValidateMandatoryField("email"),
			new VerifyPassWord("senha"),
			new SaveUser());
	
	private static ProcessStep buildChain(ProcessStep... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			ProcessStep currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
