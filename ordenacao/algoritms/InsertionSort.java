package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] e) {
        int [] sorted = e.clone();
        for(int i=1; i < e.length; i++)  {
            for (int j = i - 1; j >= 0; j--) {
                if(sorted[j+1] < sorted[j]){
                    int aux = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = aux;
                }
           }
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
