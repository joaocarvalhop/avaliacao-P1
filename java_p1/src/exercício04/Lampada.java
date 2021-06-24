package exercício04;

public class Lampada {
	
	private boolean estado;
	
	public void ligar() {
		
		this.estado = true;
	}
	
	public void Desligar() {
		
		this.estado = false;
	}

	public void mostrarEstado() {
		
		if (this.estado == true) {
			
			System.out.println("ligado");
		}
		
		else if (this.estado == false) {
			
			System.out.println("Desligado");
			
		}
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
