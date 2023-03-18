package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] e) {
        int [] sorted = e.clone();
        for (int i = 1; i < e.length; i++) {
            int n = i;
            for (int j = i - 1; j >= 0; j--) {
                if(sorted[j] > sorted[n]){
                int aux = sorted[j];
                sorted[j] = sorted[n];
                sorted[n] = aux;
                }
                n--;
            }
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
