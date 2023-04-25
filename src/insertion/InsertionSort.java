package insertion;

import algoritmo.AlgoritmoOrdenacao;

public class InsertionSort implements AlgoritmoOrdenacao{

	@Override
	public void ordenar(Integer[] x) {
		
		int i, j, eleito;
		
		for(i = 1; i <= x.length - 1; i++) {
			eleito = x[i];
			j = i - 1;
			
			while(j >= 0 && x[j] > eleito) {
				x[j + 1] = x[j];
				j = j - 1;
			}
			x[j + 1] = eleito;
		}
	}

}
