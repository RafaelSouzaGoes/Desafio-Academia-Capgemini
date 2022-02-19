package Capgemini;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner imput = new Scanner(System.in);

		System.out.println("Quantas repetições?");
		int rep = imput.nextInt();

		for (int i = 1; i <= rep; i++) {
			for (int j = rep; j >= 1; j--) {

				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		imput.close();
	}
}
