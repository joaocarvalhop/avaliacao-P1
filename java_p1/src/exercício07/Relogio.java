package exercício07;

public class Relogio {
	
	private int hora;

	public void adicionarHora() {
		hora += 1;
		
		if(hora > 23)
			hora = 0;
	}

	public void reduzirHora() {
		
		hora -= 1;

		if (hora < 0) {
			hora = 23;
		}
	}
	
	public int mostrarHora() {
		return hora;
	}

}
