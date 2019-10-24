package br.com.sort.bubble;

public class BubbleSort {

    public static int bubbleSort(int vet[]) {

        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j + 1] < vet[j]) {
                    ++cont;
                    int temp = vet[j + 1];
                    vet[j + 1] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        return cont;
    }
}



