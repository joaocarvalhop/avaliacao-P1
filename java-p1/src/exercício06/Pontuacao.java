package exercício06;

public class Pontuacao {
	
	private int pontosGanhos;
	
	public void ganharPartida() {
		pontosGanhos += 3;
	}
	
	public void empatarPartida() {
		pontosGanhos += 3;
	}
	
	public void perderPartida() {
		pontosGanhos += 0;
	}

	public int getPontosGanhos() {
		return pontosGanhos;
	}

}
