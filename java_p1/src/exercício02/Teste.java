/*2) Escreva uma classe em Java para as seguintes especificações:
- Nome da classe: Pessoa - Atributos - RG : String - CPF : String - Nome : String - Endereço : String 
- Celular : String - Email : String - Altura : double - Peso : double - Sexo : char - Idade : int - Métodos:
- Criar um método construtor que receba todas as informações (atributos) para a classe
Escreva uma classe em Java chamada TestePessoa, que contenha um método "main", e Instancie 3 objetos
diferentes do "tipo" Pessoa.

- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício02;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome    ("João Pedro Pereira Carvalho da Silva");
		pessoa.setEmail   ("joao.silva684@aluno.unip.br");
		pessoa.setEndereco("Rua Unip, 999");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEmail());
		System.out.println(pessoa.getEndereco());
		
	}

}
