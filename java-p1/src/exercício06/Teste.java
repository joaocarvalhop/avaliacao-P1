/*6) Escreva uma classe em Java as seguintes especifica��es:
- Nome da Classe: Pontuacao
- Atributos
- pontosGanhos: int
- M�todos
- ganharPartida()
- Aumentar pontosGanhos em 3
- empatarPartida()
- Aumentar pontosGanhos em 3
- perderPartida()
- Aumentar pontosGanhos em 0
Escrever uma classe Teste que realizar� a chamada de todos os
	m�todos, permitindo a verifica��o do funcionamento dos mesmos.


- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio06;

public class Teste {

	public static void main(String[] args) {
		
		Pontuacao pontuacao = new Pontuacao();

		pontuacao.ganharPartida();

		System.out.println("Total de pontos: " + pontuacao.getPontosGanhos());

		pontuacao.empatarPartida();

		System.out.println("Total de pontos: " + pontuacao.getPontosGanhos());

		pontuacao.perderPartida();

		System.out.println("Total de pontos: " + pontuacao.getPontosGanhos());

	}

}
