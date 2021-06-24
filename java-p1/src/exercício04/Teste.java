/*4) Escreva uma classe em Java para as seguintes especificações:
- Nome da Classe: Lampada
- Atributos:
- estado : boolean
- Métodos
- ligar()
- alterar atributo estado para true
- desligar()
- alterar atributo estado para false
- mostrarEstado()
Se o estado = true
Então, mostrar a mensagem “Ligada”
Senão, mostrar a mensagem “Desligada”
Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo
a verificação do funcionamento dos mesmos

- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício04;

public class Teste {

	public static void main(String[] args) {
		
		Lampada estadolampada = new Lampada();
		
		estadolampada.setEstado(true);
		estadolampada.mostrarEstado();
		
		estadolampada.setEstado(false);
		estadolampada.mostrarEstado();

	}

}
