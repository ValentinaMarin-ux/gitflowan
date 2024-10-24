package main.java.com.miempresa.miapp;

public class Aritmetica {
	
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static double restar(double a, double b) {
		return a - b;
	}
	
	public static double dividir(double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException("No se admiten divisores 0");
		}
		return a / b;
	}
	
	

}
