package br.com.sort;

import static br.com.sort.Vetor.randomVetor;
import static br.com.sort.bubble.BubbleSort.bubbleSort;

import static br.com.sort.merge.MergeSort.mergeSort;
import static br.com.sort.selection.SelectionSort.selectionSort;

public class Comparacao {
    public static void main(String[] args) {

        int[] vet5 = randomVetor(5);
        int[] vet10 = randomVetor(10);
        int[] vet50 = randomVetor(50);
        int[] vet100 = randomVetor(100);
        int[] vet1000 = randomVetor(1000);
        int[] vet10000 = randomVetor(10000);

        int[] selectionVet5 = vet5.clone();
        int[] selectionVet10 = vet10.clone();
        int[] selectionVet50 = vet50.clone();
        int[] selectionVet100 = vet100.clone();
        int[] selectionVet1000 = vet1000.clone();
        int[] selectionVet10000 = vet10000.clone();

        int[] bubbleVet5 = vet5.clone();
        int[] bubbleVet10 = vet10.clone();
        int[] bubbleVet50 = vet50.clone();
        int[] bubbleVet100 = vet100.clone();
        int[] bubbleVet1000 = vet1000.clone();
        int[] bubbleVet10000 = vet10000.clone();

        int[] mergeVet5 = vet5.clone();
        int[] mergeVet10 = vet10.clone();
        int[] mergeVet50 = vet50.clone();
        int[] mergeVet100 = vet100.clone();
        int[] mergeVet1000 = vet1000.clone();
        int[] mergeVet10000 = vet10000.clone();


        ComparaSelectioSort(selectionVet5, selectionVet10, selectionVet50, selectionVet100, selectionVet1000, selectionVet10000);
        ComparaBubbleSort(bubbleVet5, bubbleVet10, bubbleVet50, bubbleVet100, bubbleVet1000, bubbleVet10000);
        ComparaMergeSort(mergeVet5, mergeVet10, mergeVet50, mergeVet100, mergeVet1000, mergeVet10000);



    }

    public static void ComparaSelectioSort(int vet5[], int vet10[], int vet50[], int vet100[], int vet1000[], int vet10000[]) {
        System.out.println("==========   SelectionSort   ==========");
        System.out.println("Comparação Tamanho 5: " + selectionSort(vet5));
        System.out.println("Comparação Tamanho 10: " + selectionSort(vet10));
        System.out.println("Comparação Tamanho 50: " + selectionSort(vet50));
        System.out.println("Comparação Tamanho 100: " + selectionSort(vet100));
        System.out.println("Comparação Tamanho 1000: " + selectionSort(vet1000));
        System.out.println("Comparação Tamanho 10000: " + selectionSort(vet10000));
        System.out.println("========================================");
    }
    public static void ComparaBubbleSort(int vet5[], int vet10[], int vet50[], int vet100[], int vet1000[], int vet10000[]) {
        System.out.println("==========   BubbleSort   ==========");
        System.out.println("Comparação Tamanho 5: " + bubbleSort(vet5));
        System.out.println("Comparação Tamanho 10: " + bubbleSort(vet10));
        System.out.println("Comparação Tamanho 50: " + bubbleSort(vet50));
        System.out.println("Comparação Tamanho 100: " + bubbleSort(vet100));
        System.out.println("Comparação Tamanho 1000: " + bubbleSort(vet1000));
        System.out.println("Comparação Tamanho 10000: " + bubbleSort(vet10000));
        System.out.println("========================================");
    }
    public static void ComparaMergeSort(int vet5[], int vet10[], int vet50[], int vet100[], int vet1000[], int vet10000[]) {
        System.out.println("==========   MergeSort   ==========");
        System.out.println("Comparação Tamanho 5: " + mergeSort(vet5,0,vet5.length-1));
        System.out.println("Comparação Tamanho 10: " + mergeSort(vet10,0,vet10.length-1));
        System.out.println("Comparação Tamanho 50: " + mergeSort(vet50,0,vet50.length-1));
        System.out.println("Comparação Tamanho 100: " + mergeSort(vet100,0,vet100.length-1));
        System.out.println("Comparação Tamanho 1000: " + mergeSort(vet1000,0,vet1000.length-1));
        System.out.println("Comparação Tamanho 10000: " + mergeSort(vet10000,0,vet10000.length-1));
        System.out.println("========================================");
    }
}
