package br.com.cod3r.exercicios.strategy.strategies;



public class BubbleSort implements SortingStrategy{
    @Override
    public int[] sort(int[] vector) {
        int vectorLength = vector.length;

        for (int i = 0; i < vectorLength - 1; i++) {
            for (int j = 0; j < vectorLength - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        return vector;
    }
}

