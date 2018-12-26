package xadrez;

import tabuleiroDoXadrez.Peca;
import tabuleiroDoXadrez.Tabuleiro;

public class PecaDeXadrez extends Peca {
	
	private CorDaPeca corDaPeca;

	public PecaDeXadrez(Tabuleiro tabuleiro, CorDaPeca corDaPeca) {
		super(tabuleiro);
		this.corDaPeca = corDaPeca;
	}

	public CorDaPeca getCorDaPeca() {
		return corDaPeca;
	}

}
