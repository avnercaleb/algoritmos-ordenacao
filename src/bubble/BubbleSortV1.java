package bubble;

import algoritmo.AlgoritmoOrdenacao;

public class BubbleSortV1 implements AlgoritmoOrdenacao{
	
	@Override
	public void ordenar(Integer[] x) {
		
		int i, n, aux;
		
		for(n = 1; n <= x.length; n++) {
			
			for(i = 0; i <= x.length - 2; i++) {
				
				if(x[i] > x[i + 1]) {
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
				}
			}
		}
	}
}
