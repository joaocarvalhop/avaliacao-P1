/*9) Escreva uma classe em Java as seguintes especificações:
- Nome da Classe: Ordem
- Atributos
- x : int
- y : int
- z : int
- Métodos
- Ordem (int a, int b, int c)
- Construtor com parâmetros
- Atribuir parâmetros aos atributos da classe
- mostrarMaior()
- Indicar qual atributo possuí o maior valor (x, y ou z) e mostrar qual é o valor
- mostrarMenor()
- Indicar qual atributo possuí o menor valor (x, y ou z) e mostrar qual é o valor
- mostrarCrescente()
- Mostrar em ordem crescente os valores contidos em x, y e z
- mostrarDecrescente()
- Mostrar em ordem decrescente os valores contidos em x, y e z
Escrever uma classe Teste que realizará a chamada de todos os 
métodos, permitindo a verificação do funcionamento dos mesmos


- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício09;

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
