package br.com.sort.merge;

import static br.com.sort.Vetor.randomVetor;

public class MergeSort {
    public static int cont1 = 0;
    public static int cont2 = 0;


    public static int mergeSort(int[] vet, int start, int end) {

        if (start < end) {
            ++cont2;
            int mid = ((start + end) / 2);
            mergeSort(vet, start, mid);
            mergeSort(vet, mid + 1, end);
            intercala(vet, start, mid, end);
        }
        return cont1 + cont2;
    }

    public static void intercala(int[] vet, int start, int mid, int end) {

        int vetB[] = new int[vet.length];

        for (int i = start; i <= mid; i++) {
            vetB[i] = vet[i];
        }

        for (int j = mid + 1; j <= end; j++) {
            vetB[end + mid + 1 - j] = vet[j];
        }
        int i = start;
        int j = end;
        for (int k = start; k <= end; k++) {
            if (vetB[i] <= vetB[j]) {
                ++cont1;
                vet[k] = vetB[i];
                i++;
            } else {
                ++cont1;
                vet[k] = vetB[j];
                j--;
            }
        }

    }
}

