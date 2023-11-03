package src.br.com.ra4.sort;

public class QuickSort {
    private static int numTrocas = 0;
    private static int numIteracoes = 0;

    public static void ordenarPorQuickSort(int[] vetor) {
        numTrocas = 0;
        numIteracoes = 0;
        ordenarQuickSort(vetor, 0, vetor.length - 1);
        System.out.println("Número de trocas: " + numTrocas);
        System.out.println("Número de iterações: " + numIteracoes);
    }

    private static void ordenarQuickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim);
            ordenarQuickSort(vetor, inicio, indicePivo - 1);
            ordenarQuickSort(vetor, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int indiceMenor = (inicio - 1);
        for (int indiceAtual = inicio; indiceAtual < fim; indiceAtual++) {
            numIteracoes++;
            if (vetor[indiceAtual] <= pivo) {
                indiceMenor++;
                int temp = vetor[indiceMenor];
                vetor[indiceMenor] = vetor[indiceAtual];
                vetor[indiceAtual] = temp;
                numTrocas++;
            }
        }
        int temp = vetor[indiceMenor + 1];
        vetor[indiceMenor + 1] = vetor[fim];
        vetor[fim] = temp;
        numTrocas++;

        return indiceMenor + 1;
    }
}