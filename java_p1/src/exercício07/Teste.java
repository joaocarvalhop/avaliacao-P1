/*7)  Escreva uma classe em Java as seguintes especifica��es:
- Nome da Classe: Relogio
- Atributos
- hora: int
- M�todos
- adicionarHora()
- O campo hora � aumentado em 1, desde que n�o ultrapasse o valor de 23.
Se hora > 23
Ent�o atribuir 0 a hora
- subtrairHora()
- O campo hora � diminu�do em 1, desde que n�o fique negativo.
Se hora < 0
Ent�o atribuir 23 a hora
- mostrarHora()
- mostrar o valor da hora
Escrever uma classe Teste que realizar� a chamada de todos os 
m�todos, permitindo a verifica��o do funcionamento dos mesmos


- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio07;

public class Teste {

	public static void main(String[] args) {
		
		Relogio relogio = new Relogio();

		relogio.adicionarHora();

		System.out.println("S�o " + relogio.mostrarHora() + " horas");

		relogio.reduzirHora();
		relogio.reduzirHora();

		System.out.println("S�o " + relogio.mostrarHora() + " horas");

	}

}
