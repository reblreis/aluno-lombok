package entities;

/*	Annotations do Lombok para gerar de forma automática os elementos do JavaBeans
		Atributos privados
		o Construtor sem entrada de argumentos
		o Construtor com entrada de argumentos (sobrecarga de métodos)
		o Métodos de encapsulamento
			▪ Setters
			▪ Getters
		o Sobrescrita de métodos da classe Object
*/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor 	// Construtor sem argumentos
@ToString 			// Construtor com argumentos

public class Aluno {

	private Integer idAluno;
	private String nome;
	private String matricula;
	private String cpf;
}