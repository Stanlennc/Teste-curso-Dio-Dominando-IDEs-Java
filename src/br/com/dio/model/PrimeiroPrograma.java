package br.com.dio.model;
import java.util.Scanner;
public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		Scanner leia = new Scanner(System.in);
		System.out.println("Como se chama o gato?");
		gato.setNome(leia.next());
		System.out.println("Qual a cor do gato?");
		gato.setCor(leia.next());
		System.out.println("Qual a idade do gato?");
		gato.setIdade(leia.nextInt());
		System.out.println("O nome do gato é "+gato.getNome()+" sua cor é "+gato.getCor()+"\n ele tem "+gato.getIdade()+" anos");
		
		leia.close();
	}

}
