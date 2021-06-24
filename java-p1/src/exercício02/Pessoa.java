package exercício02;

public class Pessoa {
	
	private String rg;
	private String cpf;
	private String nome;
	private String endereco;
	private String celular;
	private String email;
	private double altura;
	private double peso;
	private char sexo;
	private int idade;
	
	public Pessoa() {
		
					}
	
	public Pessoa(String rg, String cpf, String nome, String endereco, String celular, String email, double altura,
			double peso, char sexo, int idade) {
		
		this.rg 	  = rg;
		this.cpf 	  = cpf;
		this.nome 	  = nome;
		this.endereco = endereco;
		this.celular  = celular;
		this.email 	  = email;
		this.altura   = altura;
		this.sexo 	  = sexo;
		this.peso 	  = peso;
		this.sexo 	  = sexo;
		this.idade    = idade;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}//fim Pessoa
