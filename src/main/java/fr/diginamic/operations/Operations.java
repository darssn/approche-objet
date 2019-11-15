package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char op) {

		double result = 0;

		switch (op) {

		case '+':

			result = a + b;

			break;

		case '-':

			result = a - b;

			break;

		case '*':

			result = a * b;

			break;

		case '/':

			result = a / b;

			break;

		default:

		}

		return result;

	}

}
