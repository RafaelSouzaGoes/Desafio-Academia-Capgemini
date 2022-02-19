package Capgemini;

import java.util.Scanner;

public class Questao2 {

	static Scanner imput = new Scanner(System.in);

	public static void main(String[] args) {

		String senha;
		String resp;

		do {

			do {
				System.out.println("Digite sua senha: ");
				senha = imput.nextLine();
			} while (!senhaSegura(senha));
			System.out.println("Senha segura!");
			System.out.println("Testar outra senha? SIM (S) ou NÃO(N)");
			resp = imput.nextLine().toUpperCase();
		} while (resp.equalsIgnoreCase("S"));
		System.out.println("volte sempre!");

	}

	private static boolean senhaSegura(String senha) {

		String cEspeciais = "!@#$%^&*()-+";
		boolean teste = false;
		boolean comprimento = false;
		boolean digito = false;
		boolean maiusculo = false;
		boolean minusculo = false;
		boolean especial = false;

		for (int i = 0; i < senha.length(); i++) {
			if (Character.isUpperCase(senha.charAt(i)))
				maiusculo = true;
			if (Character.isLowerCase(senha.charAt(i)))
				minusculo = true;
			if (Character.isDigit(senha.charAt(i)))
				digito = true;
			for (int j = 0; j < cEspeciais.length(); j++) {

				if (senha.charAt(i) == cEspeciais.charAt(j))
					especial = true;
			}
		}
		if (senha.length() > 5)
			comprimento = true;

		teste = comprimento && digito && maiusculo && minusculo && especial;

		if (!teste)
			System.out.println("Senha insegura!");

		if (!comprimento) {
			int len = senha.length();
			len = 6 - len;
			System.out.println(len + " caracteres faltando!");
		}
		if (!digito)
			System.out.println("A senha deve conter pelo menos um dígito!");
		if (!maiusculo)
			System.out.println("Adicione no minimo 1 (um) caracter maiúsculo!");
		if (!minusculo)
			System.out.println("Adicione no minimo 1 (um)  caracter minusculo!");
		if (!especial)
			System.out.println("Adicione no minimo 1 (um)  caracter especial! ( !@#$%^&*()-+ )  ");

		return teste;
	}

}
