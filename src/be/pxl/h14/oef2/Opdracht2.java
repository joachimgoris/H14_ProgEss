package be.pxl.h14.oef2;

public class Opdracht2 {

	public static void main(String[] args) {
		int getal1 = 0, getal2 = 0;
		char bewerking = '+';
		boolean fout = false;
		int result = 0;
		
		try {
			
		getal1 = Integer.parseInt(args[0]);
		getal2 = Integer.parseInt(args[1]);
		bewerking = args[2].charAt(0);
		switch(bewerking) {
		case '+':
			result = getal1+getal2;
			break;
		case '-':
			result = getal1-getal2;
			break;
		case '/':
		result = getal1/getal2;
		break;
		case 'x':
			result = getal1*getal2;
			break;
		default:
			fout = true;
		}
		if(!fout) {
			System.out.println(getal1+ " "+bewerking+" "+getal2+" = "+result);
		}
		else {
			System.out.println("Foute bewerking!");
		}
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
