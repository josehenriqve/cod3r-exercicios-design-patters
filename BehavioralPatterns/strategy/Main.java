package br.com.cod3r.exercicios.strategy;

import br.com.cod3r.exercicios.strategy.strategies.BubbleSort;
import br.com.cod3r.exercicios.strategy.strategies.InsertionSort;

public class Main {
    public static void print(int[] vector){
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] vector = new int[]{1,8,10,90,1,76,13333,4,21,-3};

        Sort sort = new Sort(vector);

        sort.getResult(new InsertionSort());

        print(vector);
    }
}
