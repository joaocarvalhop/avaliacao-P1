/*10) Write a class named ComplexNum for recording a complex number. The class must have two
double instance variables, real and imaginary. Na object of this class represents the 
complex number real + imaginary * i (where i is the root of ). Write the instance method 
size that returns, in double, the value of real2−imaginary2. Write a class for testing it.

- João Pedro Pereira Carvalho da Silva - N6579B7 - SI3P33
- 08/05/2021*/

package exercício10;

public class Test {

	public static void main(String[] args) {
		
		ComplexNum complex = new ComplexNum(5,8);
		
		System.out.println(complex);
		
		System.out.println("Subtraction result: " + complex.subtrair(complex));

	}

}
