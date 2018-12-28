package xadrez;

import tabuleiroDoXadrez.Posicao;
import tabuleiroDoXadrez.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	public static PartidaDeXadrez[][] getPecas;
	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);

			}
		}

		return mat;
	}
	
	private void novaPosicaoPeca(char coluna, int linha, PecaDeXadrez peca) {
		
		tabuleiro.lugarDaPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void iniciarPartida() {
		novaPosicaoPeca('b', 6, new Torre(tabuleiro,CorDaPeca.BRANCO));
		novaPosicaoPeca('e', 8,new Rei(tabuleiro,CorDaPeca.PRETO));
		novaPosicaoPeca('e',1,new Rei(tabuleiro,CorDaPeca.BRANCO));
	}
}
