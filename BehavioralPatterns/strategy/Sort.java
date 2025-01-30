package br.com.cod3r.exercicios.strategy;

import br.com.cod3r.exercicios.strategy.strategies.SortingStrategy;
import br.com.cod3r.strategy.calc.after.strategies.OperationStrategy;

public class Sort {

    int[] vector;

    Sort(int[] vector) {
        this.vector = vector;
    }

    public int[] getResult(SortingStrategy strategy) {
        return strategy.sort(vector);

    }
}
