package xadrez.pecas;

import tabuleiroDoXadrez.Tabuleiro;
import xadrez.CorDaPeca;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

	public Rei(Tabuleiro tabuleiro, CorDaPeca corDaPeca) {
		super(tabuleiro, corDaPeca);
	}

	@Override
	public String toString() {
		return "k";
	}
	
}
