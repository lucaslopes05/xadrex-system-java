package tabuleiroDoXadrez;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas <1) {
			throw new TabuleiroException("Erro criando tabuleiro: É nessesario que tenha no minimo 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}



	public int getColunas() {
		return colunas;
	}

	
	public Peca peca(int linha , int coluna) {
		if(!posicaoStatus(linha,coluna)) {
			throw new TabuleiroException("Posição no existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoStatus(posicao)) {
			throw new TabuleiroException("Posição no existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarDaPeca(Peca peca, Posicao posicao) {
		if(pecaStatus(posicao)) {
			throw new TabuleiroException("já existe um peça na posição "+ posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoStatus(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoStatus(Posicao posicao) {
		return posicaoStatus(posicao.getLinha(),posicao.getColuna());
	}
	
	public boolean pecaStatus(Posicao posicao) {
		if(!posicaoStatus(posicao)) {
			throw new TabuleiroException("Essa posição não existe no tabuleiro");
		}
		return peca(posicao)!= null;
	}
}
