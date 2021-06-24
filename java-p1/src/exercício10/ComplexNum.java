package exercício10;

public class ComplexNum {
	
	private double real;
	private double imaginary;

	public ComplexNum() {
	}
	
	public ComplexNum(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double subtrair(ComplexNum x) {
		return Math.pow(x.real, 2) - Math.pow(x.imaginary, 2);
	}


}
