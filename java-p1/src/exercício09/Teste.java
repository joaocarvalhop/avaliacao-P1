/*9) Escreva uma classe em Java as seguintes especifica��es:
- Nome da Classe: Ordem
- Atributos
- x : int
- y : int
- z : int
- M�todos
- Ordem (int a, int b, int c)
- Construtor com par�metros
- Atribuir par�metros aos atributos da classe
- mostrarMaior()
- Indicar qual atributo possu� o maior valor (x, y ou z) e mostrar qual � o valor
- mostrarMenor()
- Indicar qual atributo possu� o menor valor (x, y ou z) e mostrar qual � o valor
- mostrarCrescente()
- Mostrar em ordem crescente os valores contidos em x, y e z
- mostrarDecrescente()
- Mostrar em ordem decrescente os valores contidos em x, y e z
Escrever uma classe Teste que realizar� a chamada de todos os 
m�todos, permitindo a verifica��o do funcionamento dos mesmos


- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exerc�cio09;

public class Teste {

	public static void main(String[] args) {
		
		Ordem ordem = new Ordem(5,6,7);
		
		System.out.println("Maior Numero ---> " + ordem.mostrarMaior());
		System.out.println("Menor Numero ---> " + ordem.mostrarMenor());
		
		System.out.println();
		System.out.println("Ordem Crescente ---> ");
		ordem.mostrarCrescente();
		
		System.out.println();
		System.out.println("Ordem Decrescente ---> ");
		ordem.mostrarDecrescente();

	}

}
