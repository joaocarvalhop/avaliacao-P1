/*1) Escreva uma classe em Java para as seguintes especifica��es:
Nome da classe: Aluno		Atributos
RA : String		Nome : String		Curso : String
Escreva um m�todo construtor em Java para a classe Aluno que receba como par�metros:
RA, Nome e Curso. Os atributos devem ter receber os valores dos par�metros
Escreva uma classe em Java chamada TesteAluno, que contenha um m�todo "main", e instancie 3 objetos
diferentes do "tipo" Aluno

- Jo�o Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- data : 08/05/2021*/

package exerc�cio01;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setRa("N6579B7");
		aluno.setNome("Jo�o Pedro");
		aluno.setCurso("Sistemas de Informa��o");
		
		System.out.print  (aluno.getRa() + " - ");
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCurso());

	}

}
