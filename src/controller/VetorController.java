package controller;

public class VetorController {

	public VetorController() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int FVetorPar(int[] Vet, int tamanho, int par) {
		//Condição de parada -> Quando o tamanho for menor que 0, isto é quando o vetor "acabar" para a função, 
		//ele retorna o par.
		if(tamanho < 0) {
			return par;
		}
		if(Vet[tamanho] % 2 == 0) {
			par+=1;
		}
		return FVetorPar(Vet,tamanho-1,par);
		
		/*
		 * A função recebe como parâmetro o vetor, o seu tamanho e uma váriavel declarada na classe main par
		 * Onde a função recursiva simplesmente realiza a chamada de si mesma, percorrendo todo o vetor, até
		 * chegar na sua condição de parada.
		 * Porém, com uma condicional que verifica, se o valor do vetor na posição atual é um par, se sim é
		 * adicionado ao contador de pares (várivel "par") se não a função simplesmente chama ela mesma, 
		 * passando para
		 */
	}

}
