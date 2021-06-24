package exercício09;

import java.util.Collections;
import java.util.stream.Stream;

public class Ordem {
	
	private int x;
	private int y;
	private int z;

	public Ordem(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int mostrarMaior() {
		if (x > y && x > z)
			return x;

		else if (y > x && y > z)
			return y;

		return z;
	}

	public int mostrarMenor() {
		if (x < y && x < z)
			return x;

		else if (y < x && y < z)
			return y;

		return z;
	}

	public void mostrarCrescente() {
		Stream.of(x,y,z).sorted().forEach(System.out::println);
	}

	public void mostrarDecrescente() {
		Stream.of(x,y,z).sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
