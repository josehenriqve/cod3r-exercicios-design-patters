package br.com.cod3r.exercicios.strategy.strategies;

public class InsertionSort implements SortingStrategy{
    @Override
    public int[] sort(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int key = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > key) {
                vector[j + 1] = vector[j];
                j = j - 1;
            }
            vector[j + 1] = key;
        }
        return vector;
    }
}
