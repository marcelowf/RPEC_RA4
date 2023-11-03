package src.br.com.ra4.main;

import java.util.Scanner;
import src.br.com.ra4.sort.InsertionSort;
import src.br.com.ra4.sort.QuickSort;
import src.br.com.ra4.sort.ShellSort;
import src.br.com.ra4.vetor.InteractingVector;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira o tamanho do vetor: ");
		int escolhaTamanhoDoVetor = scanner.nextInt();
		int[] arrayGerado = InteractingVector.gerarVetorAleatorio(escolhaTamanhoDoVetor);
		int escolhaDoSort;

		do {
			System.out.print("Escolha um Sort: \n0) Sair\n1) Insertion Sort\n2) Quick Sort\n3) Shell Sort\nEscolha: ");
			escolhaDoSort = scanner.nextInt();
			if (escolhaDoSort == 1) {
				InsertionSort.ordenarPorInsertionSort(arrayGerado);
			} else if (escolhaDoSort == 2) {
				QuickSort.ordenarPorQuickSort(arrayGerado);
			} else if (escolhaDoSort == 3) {
				ShellSort.ordenarPorShell(arrayGerado);
			} else if (escolhaDoSort >= 4 || escolhaDoSort <= -1) {
				System.out.println("Escolha invalida");
			}
		} while (escolhaDoSort < 0 && escolhaDoSort > 3);
		scanner.close();
		System.out.println("Programa Finalizado");
	}
}