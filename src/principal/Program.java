package principal;

import entities.Aluno;

/* JAVABEANS 
• Atributos privados
• Construtor sem entrada de argumentos
• Construtor com entrada de argumentos (sobrecarga de métodos)
• Métodos de encapsulamento
	o Setters
	o Getters
• Sobrescrita de métodos da classe Object
*/

public class Program {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(); // instância de aluno

		aluno.setIdAluno(1);
		aluno.setNome("Rafaela Costa");
		aluno.setMatricula("151009");
		aluno.setCpf("5874111452");

		System.out.println("\nDADOS DO ALUNO");
		System.out.println(aluno.toString());
	}
}