package br.com.sort.selection;


public class SelectionSort {

    public static int selectionSort(int vet[]) {
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            int min = i;
            for (int j = 0; j < vet.length; j++) {
                if (vet[j]>vet[min]) {
                    ++cont;
                    min = j;
                }
                int temp = vet[i];
                vet[i] = vet[min];
                vet[min] = temp;
            }
        }
        return cont;
    }


}
