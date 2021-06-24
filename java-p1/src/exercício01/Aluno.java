package exercício01;

public class Aluno {
	
	private String ra;
	private String nome;
	private String curso;
	
	public Aluno() {
		
	}
	
	public Aluno (String Ra, String Nome, String Curso) {
		
		this.curso = Curso;
		this.nome  = Nome;
		this.ra    = Ra;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}//fim Aluno
