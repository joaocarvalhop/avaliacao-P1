/*8) Escreva uma classe em Java as seguintes especifica��es:
- Nome da Classe: Telefone
- Atributos
- numeroMinutos : int � valor inicial 0
- preco : double � valor inicial 2.0
- M�todos
- duracaoLigacao(int vl)
- Adiciona o �vl� (par�metro de entrada do m�todo) ao atributo
�numeroMinutos�
- alterarPreco(double prc)
- Altera o atributo �preco� para o valor do par�metro �prc�
- mostrarConta()
- mostrar o valor da atual da conta telef�nica numMinutos * preco
Escrever uma classe Teste que realizar� a chamada de todos os 
m�todos, permitindo a verifica��o do funcionamento dos mesmos.


- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio08;

public class Teste {

	public static void main(String[] args) {
		
		Telefone telefone = new Telefone();
		
		telefone.duracaoLigacao(7);
		telefone.alterarPreco(3.5);
		
		System.out.printf("O pre�o total � de: R$ %.2f",telefone.MostrarConta());

	}

}
