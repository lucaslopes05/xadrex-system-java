package xadrez.pecas;

import tabuleiroDoXadrez.Tabuleiro;
import xadrez.CorDaPeca;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

	public Torre(Tabuleiro tabuleiro, CorDaPeca corDaPeca) {
		super(tabuleiro, corDaPeca);
	}

	@Override
	public String toString() {
		return "R";
	}
}



