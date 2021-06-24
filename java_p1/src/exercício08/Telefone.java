package exercício08;

public class Telefone {
	
	private int numeroMinutos = 0;
	private double preco = 2.0;

	public void duracaoLigacao(int vl){
		numeroMinutos += vl;
	}
	
	public void alterarPreco(double prc){
		preco = prc;
	}
	
	public double MostrarConta(){
		return numeroMinutos * preco;
	}

}
