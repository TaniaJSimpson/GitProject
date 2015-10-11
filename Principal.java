package contarLletres;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		char com;
		int car = 0;

		System.out.println("Esciu una frase: ");
		String frase = lector.nextLine();
		ArrayList array = new ArrayList();

		while (car < frase.length()) {
			com = frase.charAt(car);

			int contador = 0;
			for (int i = 0; i < frase.length(); i++) {
				if (com == frase.charAt(i)) {
					contador++;

				}
			}
			String res = "";
			if (!array.contains(res)) {
				array.add(com);

				String lletra = array.toString();
				car++;

			}
			System.out.println("La lletra " + com + " apareix " + contador + " vegades.");
		}

	}
}
