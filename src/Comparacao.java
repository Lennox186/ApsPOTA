import static br.com.sort.Vetor.randomVetor;
import static br.com.sort.bubble.BubbleSort.bubbleSort;
import static br.com.sort.selection.SelectionSort.selectionSort;

public class Comparacao {
    public static void main(String[] args) {

        int[] vet5 = randomVetor(5);
        int[] vet10 = randomVetor(10);
        int[] vet50 = randomVetor(50);
        int[] vet100 = randomVetor(100);
        int[] vet1000 = randomVetor(1000);
        int[] vet10000 = randomVetor(10000);

        int[] selectionVet5 = vet5;
        int[] selectionVet10 = vet10;
        int[] selectionVet50 = vet50;
        int[] selectionVet100 = vet100;
        int[] selectionVet1000 = vet1000;
        int[] selectionVet10000 = vet10000;

        int[] bubbleVet5 = vet5;
        int[] bubbleVet10 = vet10;
        int[] bubbleVet50 = vet50;
        int[] bubbleVet100 = vet100;
        int[] bubbleVet1000 = vet1000;
        int[] bubbleVet10000 = vet10000;


        ComparaSelectioSort(selectionVet5, selectionVet10, selectionVet50, selectionVet100, selectionVet1000, selectionVet10000);

        ComparaBubbleSort(bubbleVet5, bubbleVet10, bubbleVet50, bubbleVet100, bubbleVet1000, bubbleVet10000);



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
}
