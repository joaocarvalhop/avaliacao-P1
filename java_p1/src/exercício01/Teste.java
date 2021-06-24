/*1) Escreva uma classe em Java para as seguintes especificações:
Nome da classe: Aluno		Atributos
RA : String		Nome : String		Curso : String
Escreva um método construtor em Java para a classe Aluno que receba como parâmetros:
RA, Nome e Curso. Os atributos devem ter receber os valores dos parâmetros
Escreva uma classe em Java chamada TesteAluno, que contenha um método "main", e instancie 3 objetos
diferentes do "tipo" Aluno

- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- data : 08/05/2021*/

package exercício01;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setRa("N6579B7");
		aluno.setNome("João Pedro");
		aluno.setCurso("Sistemas de Informação");
		
		System.out.print  (aluno.getRa() + " - ");
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCurso());

	}

}
