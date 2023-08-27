package view;

import br.edu.fateczl.ordenacao.bubblesort.ControllerB;
import br.edu.fateczl.ordenacao.mergesort.ControllerM;

public class Principal {

	public static void main(String[] args) {
		int vet1[] = { 44, 43, 42, 41, 40, 39, 38 };

		int vet2[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };

		// Organizando via BubbleSort
		ControllerB bs = new ControllerB();
		bs.BubbleSort(vet1);
		bs.BubbleSort(vet2);

		System.out.println("\n Vetor 1 - BubbleSort");
		for (int i : vet1) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n Vetor 2 - BubbleSort");
		for (int i : vet2) {
			System.out.print(i + " ");
		}
		
		
		// Organizando via MergeSort
		
		int vet11[] = { 44, 43, 42, 41, 40, 39, 38 };
		int vet22[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		
		ControllerM ms = new ControllerM();
		ms.MergeSort(vet11, 0, vet11.length-1);
		ms.MergeSort(vet22, 0, vet22.length-1);
		
		System.out.println("\n Vetor 1 - MergeSort");
		for (int i : vet11) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n Vetor 2 - MergeSort");
		for (int i : vet22) {
			System.out.print(i + " ");
		}
		
		
	}

}
