package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int fim = sorted.length - 1;
        quicksort(sorted, 0, fim);
        return sorted;
    }
    private static void quicksort(int[] e, int inicio, int fim) {
        if (inicio < fim) {
            int p = divide(e, inicio, fim);
            quicksort(e, inicio, p-1);
            quicksort(e, p+1, fim);
        }
    }
    private static int divide(int[] e, int inicio, int fim) {
        int pivot = e[fim];
        int j = inicio;
        for(int i = inicio; i < fim; i++){
            if(e[i] <= pivot){
                int aux = e[i];
                e[i] = e[j];
                e[j] = aux;
                j++;
            }
        }
        int aux = e[fim];
        System.out.println(fim + " " + j);
        e[fim] = e[j];
        e[j] = aux;
        return j;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

}
