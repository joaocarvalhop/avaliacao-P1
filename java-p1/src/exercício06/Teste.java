/*6) Escreva uma classe em Java as seguintes especificações:
- Nome da Classe: Pontuacao
- Atributos
- pontosGanhos: int
- Métodos
- ganharPartida()
- Aumentar pontosGanhos em 3
- empatarPartida()
- Aumentar pontosGanhos em 3
- perderPartida()
- Aumentar pontosGanhos em 0
Escrever uma classe Teste que realizará a chamada de todos os
	métodos, permitindo a verificação do funcionamento dos mesmos.


- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício06;

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
