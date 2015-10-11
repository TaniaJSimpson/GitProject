package contarLletres;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		char com;
		int car = 0;

		System.out.println("Esciu una frase: ");
		String frase = lector.nextLine();
		ArrayList array = new ArrayList();
		List<Character> lletres = new ArrayList<>();
		List<Integer> numeros = new ArrayList<>();
			//CONFLICTEWEB
		while (car < frase.length()) {
			com = frase.charAt(car);

			int contador = 0;
			char[] toCharArray = frase.toCharArray();
			for (int i = 0; i < frase.length(); i++) {
				
				char caracter = toCharArray[i];

				
				if (com == frase.charAt(i)) {
					contador++;
					
					if (Character.isDigit(caracter)) {
						numeros.add((int) caracter);

					} else {
						if (Character.isLetter(caracter)) {
							lletres.add(caracter);

				}
			}
			String res = "";
			if (!array.contains(res)) {
				array.add(com);

				car++;

			}
			System.out.println("La lletra " + com + " apareix " + contador + " vegades.");
		}

			}
		}
		System.out.println(lletres + " Són caracteres.");
		System.out.println(numeros + " Són números.");

	}
}
