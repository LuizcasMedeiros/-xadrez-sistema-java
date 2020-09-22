package xadrez;

import jogotabueiro.Tabuleiro;

public class PartidadeXadrez {

	private Tabuleiro tabuleiro;
	
	
	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}
	
	public PecadeXadrez[][] getPecas(){
		PecadeXadrez[][] matriz = new PecadeXadrez
				[tabuleiro.getLinhas()]
				[tabuleiro.getColunas()];
		for (int i=0; i <tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				matriz[i][j] = (PecadeXadrez) tabuleiro.peca(i,j);
			}
		}
		return matriz;
	}
	
}
