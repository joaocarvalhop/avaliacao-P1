/*3) Escreva uma classe em Java para as seguintes especifica��es:
- Nome da classe: Automovel
- Atributos
- Placa : String
- Cor : String
- Nr Portas : int
- Combust�vel : String
- Quilometragem : long
- Renavam : String
- Chassi : String
- Nr Marchas : int
- Ligado : boolean
- Velocidade : int
- M�todos:
- Criar um m�todo construtor que receba todas as informa��es (atributos) para a classe
- ligarDesligar(boolean ligaDesliga)
- Ligar Ligado = true
- Desligar Ligado = false
Escrever uma classe Teste que realizar� a chamada de todos os m�todos, permitindo a verifica��o do funcionamento dos mesmos.

- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio03;

public class Teste {

	public static void main(String[] args) {
		
		Automovel automovel1 = new Automovel();
		Automovel automovel2 = new Automovel();
		Automovel automovel3 = new Automovel();
		
		automovel1.setPlaca("TAB-9C99");
		automovel1.setCor("Prata");
		automovel1.setNrportas(4);
		automovel1.setCombustivel("Gasolina");
		automovel1.setQuilometragem(55600);
		automovel1.setRenavam("01234567892");
		automovel1.setChassi ("0A2S5D841AS5611");
		automovel1.setNrmarchas(6);
		automovel1.setLigado(true);
		automovel1.setVelocidade(260);
		
			
		System.out.println(automovel1.getPlaca());
		System.out.println(automovel1.getCor());
		System.out.println(automovel1.getNrportas());
		System.out.println(automovel1.getCombustivel());
		System.out.println(automovel1.getQuilometragem());
		System.out.println(automovel1.getRenavam());
		System.out.println(automovel1.getChassi());
		System.out.println(automovel1.getNrmarchas());
		System.out.println(automovel1.isLigado());
		System.out.println(automovel1.getVelocidade());
	}

}
