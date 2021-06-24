/*8) Escreva uma classe em Java as seguintes especificações:
- Nome da Classe: Telefone
- Atributos
- numeroMinutos : int – valor inicial 0
- preco : double – valor inicial 2.0
- Métodos
- duracaoLigacao(int vl)
- Adiciona o “vl” (parâmetro de entrada do método) ao atributo
“numeroMinutos”
- alterarPreco(double prc)
- Altera o atributo “preco” para o valor do parâmetro “prc”
- mostrarConta()
- mostrar o valor da atual da conta telefônica numMinutos * preco
Escrever uma classe Teste que realizará a chamada de todos os 
métodos, permitindo a verificação do funcionamento dos mesmos.


- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício08;

public class Teste {

	public static void main(String[] args) {
		
		Telefone telefone = new Telefone();
		
		telefone.duracaoLigacao(7);
		telefone.alterarPreco(3.5);
		
		System.out.printf("O preço total é de: R$ %.2f",telefone.MostrarConta());

	}

}
