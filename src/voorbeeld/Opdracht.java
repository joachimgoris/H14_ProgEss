package voorbeeld;

import java.util.Scanner;

public class Opdracht {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			int numerator = Integer.parseInt(input.next());
			int denominator = Integer.parseInt(input.next());
			int division = numerator/denominator;
			System.out.println(numerator +"/"+denominator+"="+division);
			input.close();
		} catch (NumberFormatException | IndexOutOfBoundsException ex) {
			System.out.println("Invalid input");
			System.out.println(ex.getMessage());
		}
		catch (ArithmeticException ex) {
			System.out.println("Division by 0");
			System.out.println(ex.getMessage());
		}
		catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("The end");
		}
	}

}
