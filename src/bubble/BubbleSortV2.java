package bubble;

import algoritmo.AlgoritmoOrdenacao;

public class BubbleSortV2 implements AlgoritmoOrdenacao{

	@Override
	public void ordenar(Integer[] x) {
		
		int i, j, aux;
		
		for(i = 1; i <= x.length - 1; i++) {
			
			for(j = x.length - 1; j >= i; j--) {
				
				if(x[j] < x[j - 1]) {
					aux = x[j];
					x[j] = x[j - 1];
					x[j - 1] = aux;
				}
			}
		}
	}

}
