package br.com.cod3r.exercicios.chainOfResponsability.process.steps;

import br.com.cod3r.exercicios.chainOfResponsability.process.service.ProcessContext;

public class VerifyPassWord extends ProcessStep {
    public VerifyPassWord(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        Object field = context.cliente.getPassWord();
        if(field == null) {
            throw new Exception(String.format("Senha nula"));
        }else if (field.toString().length() < 8) {
            throw new Exception(String.format("Sua senha precisa conter pelo menos 8 caracteres"));
        }
        return next(context, true);
    }
}
