package exercício05;

public class Carro {
	
	private double velocidade;
	
	public void acelerar() {
		
		this.velocidade = this.velocidade + 10;
	}
	
	public void freiar() {
		
		this.velocidade = this.velocidade - 10;
	}
	
	public void mostrarVelocidade() {
		
		System.out.println("A velocidade autual é: " + this.velocidade + "km/h");
	}
	

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}//Fim Carro
