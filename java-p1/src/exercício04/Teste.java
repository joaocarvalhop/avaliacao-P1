/*4) Escreva uma classe em Java para as seguintes especifica��es:
- Nome da Classe: Lampada
- Atributos:
- estado : boolean
- M�todos
- ligar()
- alterar atributo estado para true
- desligar()
- alterar atributo estado para false
- mostrarEstado()
Se o estado = true
Ent�o, mostrar a mensagem �Ligada�
Sen�o, mostrar a mensagem �Desligada�
Escrever uma classe Teste que realizar� a chamada de todos os m�todos, permitindo
a verifica��o do funcionamento dos mesmos

- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio04;

public class Teste {

	public static void main(String[] args) {
		
		Lampada estadolampada = new Lampada();
		
		estadolampada.setEstado(true);
		estadolampada.mostrarEstado();
		
		estadolampada.setEstado(false);
		estadolampada.mostrarEstado();

	}

}
