/*7)  Escreva uma classe em Java as seguintes especificações:
- Nome da Classe: Relogio
- Atributos
- hora: int
- Métodos
- adicionarHora()
- O campo hora é aumentado em 1, desde que não ultrapasse o valor de 23.
Se hora > 23
Então atribuir 0 a hora
- subtrairHora()
- O campo hora é diminuído em 1, desde que não fique negativo.
Se hora < 0
Então atribuir 23 a hora
- mostrarHora()
- mostrar o valor da hora
Escrever uma classe Teste que realizará a chamada de todos os 
métodos, permitindo a verificação do funcionamento dos mesmos


- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício07;

public class Teste {

	public static void main(String[] args) {
		
		Relogio relogio = new Relogio();

		relogio.adicionarHora();

		System.out.println("São " + relogio.mostrarHora() + " horas");

		relogio.reduzirHora();
		relogio.reduzirHora();

		System.out.println("São " + relogio.mostrarHora() + " horas");

	}

}
