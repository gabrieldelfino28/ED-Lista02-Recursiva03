package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Vet = {1,3,5,2,4,6,9};
		VetorController v = new VetorController();
		int par=0;
		int tamanho = Vet.length-1;
		int res = v.FVetorPar(Vet, tamanho, par);
		
		System.out.println("n de pares: "+res);
	}

}
