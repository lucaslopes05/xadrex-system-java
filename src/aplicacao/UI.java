package aplicacao;

import xadrez.PecaDeXadrez;

public class UI {

	public static void printTabuleiro(PecaDeXadrez[][] pecaDeXadrezs) {

		for (int i = 0; i < pecaDeXadrezs.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecaDeXadrezs.length; j++) {
				printPeca(pecaDeXadrezs[i][j]);
			}
			System.out.println();

		}
		System.out.println("  a b c d e f g h ");
	}

	private static void printPeca(PecaDeXadrez pecaDeXadrezs) {
		if (pecaDeXadrezs == null) {
			System.out.print("-");
		} else {
			System.out.print(pecaDeXadrezs);
		}

		System.out.print(" ");
	}
}
