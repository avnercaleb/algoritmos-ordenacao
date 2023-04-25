package selection;

import algoritmo.AlgoritmoOrdenacao;

public class SelectionSort implements AlgoritmoOrdenacao{

	@Override
	public void ordenar(Integer[] x) {
		
		int i, j, eleito, menor, pos;
		
		for(i = 0; i <= x.length - 2; i ++) {
			eleito = x[i];
			menor = x[i + 1];
			pos = i + 1;
			
			for(j = i + 2; j <= x.length - 1; j++) {
				
				if(x[j] < menor) {
					menor = x[j];
					pos = j;
				}
			}
			if(menor < eleito) {
				x[i] = x[pos];
				x[pos] = eleito;
			}
		}
	}

}
