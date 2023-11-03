package src.br.com.ra4.vetor;

import java.util.Random;

public class InteractingVector {
	public static int[] gerarVetorAleatorio(int tamanho) {
		int[] vetorAleatorio = new int[tamanho];
		Random geradorAleatorio = new Random();
		for (int indice = 0; indice < tamanho; indice++) {
			vetorAleatorio[indice] = geradorAleatorio.nextInt(1000);
		}
		return vetorAleatorio;
	}
}