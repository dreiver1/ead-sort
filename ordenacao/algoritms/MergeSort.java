package ordenacao.algoritms;

import java.util.Arrays;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        return mergeSort(sorted, 0, sorted.length);
    }
    
    private static int[] mergeSort(int[] e, int inicio, int fim) {
        if (fim - inicio > 1) {
            int meio = (fim + inicio) / 2;
            mergeSort(e, inicio, meio);
            mergeSort(e, meio, fim);
            merge(e, inicio, meio, fim);
        }
        return e;
    }

    private static void merge(int[] array, int inicio, int meio, int fim) {
        int[] left = Arrays.copyOfRange(array, inicio, meio);
        int[] right = Arrays.copyOfRange(array, meio, fim);
        int j = 0;
        int k = 0;
        for(int i = inicio; i < fim ; i++){
            if(j >= left.length){
                array[i] = right[k];
                k++;
            } else if(k >= right.length) {
                array[i] = left[j];
                j++;
            } else if(left[j] < right[k]){
                array[i] = left[j];
                j++;
            } else {
                array[i] = right[k];
                k++;
            }
            
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
