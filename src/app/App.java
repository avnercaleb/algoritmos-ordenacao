package app;

import algoritmo.Algoritmo;
import selection.SelectionSort;

public class App {

	public static void main(String[] args) {
		
		Integer[] x = {5, 4, 2, 1, 8, 3, 7, 6, 9};
		Algoritmo.sort(new SelectionSort(), x);
		
		for(Integer i : x) {
			System.out.println(i);
		}
	}

}
