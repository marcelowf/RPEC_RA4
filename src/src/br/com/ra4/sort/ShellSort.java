package src.br.com.ra4.sort;

public class ShellSort {
	public static void ordenarPorShell(int[] vetor) {
		int tamanhoDoVetor = vetor.length;
		int trocas = 0; // Variável para contar o número de trocas
		int iteracoes = 0; // Variável para contar o número de iterações
		for (int intervalo = tamanhoDoVetor / 2; intervalo > 0; intervalo /= 2) {
			for (int indiceAtual = intervalo; indiceAtual < tamanhoDoVetor; indiceAtual++) {
				int elementoAtual = vetor[indiceAtual];
				int indiceAnterior;
				for (indiceAnterior = indiceAtual; indiceAnterior >= intervalo
						&& vetor[indiceAnterior - intervalo] > elementoAtual; indiceAnterior -= intervalo) {
					vetor[indiceAnterior] = vetor[indiceAnterior - intervalo];
					trocas++; // Incrementa o contador de trocas
				}
				vetor[indiceAnterior] = elementoAtual;
				iteracoes++; // Incrementa o contador de iterações
			}
		}
		System.out.println("Número de trocas: " + trocas);
		System.out.println("Número de iterações: " + iteracoes);
	}
}