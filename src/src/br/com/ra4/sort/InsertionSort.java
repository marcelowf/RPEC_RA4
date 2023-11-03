package src.br.com.ra4.sort;

public class InsertionSort {
	public static void ordenarPorInsertionSort(int[] array) {
		int tamanhoDoArray = array.length;
		int numeroTrocas = 0;
		int numeroIteracoes = 0;
		for (int indice = 1; indice < tamanhoDoArray; indice++) {
			int elementoAtual = array[indice];
			int indiceAnterior = indice - 1;
			while (indiceAnterior >= 0 && array[indiceAnterior] > elementoAtual) {
				array[indiceAnterior + 1] = array[indiceAnterior];
				indiceAnterior--;
				numeroTrocas++; // Incrementa o contador de trocas
			}
			array[indiceAnterior + 1] = elementoAtual;
			numeroIteracoes++; // Incrementa o contador de iterações
		}
		System.out.println("Número de Trocas: " + numeroTrocas);
		System.out.println("Número de Iterações: " + numeroIteracoes);
	}
}