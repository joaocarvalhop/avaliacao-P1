/*5) Escreva uma classe em Java as seguintes especifica��es:
- Nome da Classe: Carro
- Atributos
- velocidade : double
- M�todos
- acelerar()
- Aumentar velocidade em 10
- freiar()
- Diminuir velocidade em 10
- mostrarVelocidade()
- mostrar o valor da velocidade
Escrever uma classe Teste que realizar� a chamada de todos os
m�todos, permitindo a verifica��o do funcionamento dos mesmos.

- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio05;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.freiar();
		
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.freiar();
		carro2.freiar();
		carro2.acelerar();
		
		carro3.acelerar();
		carro3.acelerar();
		carro3.acelerar();
		carro3.freiar();
		carro3.freiar();
		
		carro1.mostrarVelocidade();
		carro2.mostrarVelocidade();
		carro3.mostrarVelocidade();

	}

}
