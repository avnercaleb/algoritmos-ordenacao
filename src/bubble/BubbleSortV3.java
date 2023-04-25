package bubble;

import algoritmo.AlgoritmoOrdenacao;

public class BubbleSortV3 implements AlgoritmoOrdenacao{

	@Override
	public void ordenar(Integer[] x) {
		
		int n = 1,
			troca = 1,
			aux, i;
		
		while(n <= x.length && troca == 1) {
			
			troca = 0;
			for(i = 0; i <= x.length - 2; i++) {
				if(x[i] > x[i + 1]) {
					troca = 1;
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
				}
			}
			n++;
		}
	}

}
