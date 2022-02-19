package Capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String resp;
		do {

			String palavra = leInformacao("Digite a palavra que sera verificada ", input);
			pegaQtdDeAnagramas(palavra);
			System.out.println("\nTestar outra senha? SIM (S) ou NÃO(N)");
			resp = input.nextLine();
		} while (resp.equalsIgnoreCase("S"));
		System.out.println("volte sempre!");

		input.close();
	}

	public static String leInformacao(String msg, Scanner input) {

		System.out.println(msg);
		String entrada = input.nextLine().toLowerCase().replace(" ", ""); // armazena a paravra, deixa tudo em minusculo
																			// e retira os espaços!

		return entrada;
	}

	// verificar a quantidade de anagramas.

	public static int pegaQtdDeAnagramas(String palavra) {

		ArrayList<String> listaSubstrings = identificaTodasSubstrings(palavra);

		int contador = 0;
		for (int i = 0; i < listaSubstrings.size() - 1; i++) {
			for (int j = i + 1; j < listaSubstrings.size(); j++) {
				char[] c1 = listaSubstrings.get(i).toCharArray();
				char[] c2 = listaSubstrings.get(j).toCharArray();

				Arrays.sort(c1);
				Arrays.sort(c2);

				if (Arrays.equals(c1, c2)) {
					contador++;
				}
			}
		}
		System.out.println("Quantidade de pares que são anagramas é de " + contador);
		return contador;
	}

	// identificar todas as substrings.
	 
	public static ArrayList<String> identificaTodasSubstrings(String palavra) {
		ArrayList<String> listaSubstrings = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i + 1; j <= palavra.length(); j++) {
				listaSubstrings.add(palavra.substring(i, j));
			}
		}
		return listaSubstrings;
	}

}
