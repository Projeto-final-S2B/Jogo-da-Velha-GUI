package br.com.pedrodev.jogodavelha.domain;

@SuppressWarnings("unused")
public class Jogo {

	private int[][] matrizGame = new int[3][3];
	private int numeroJogadas = 0;

	private static final int XWIN = 12; // Marcar jogada x com 4
	private static final int OWIN = 3; // Marcar jogada 0 com 1

	public boolean XWin() {

		int soma = 0;

		// varre horizontal
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				soma += matrizGame[linha][coluna];
				if (coluna == 2) {
					if (soma == 12) {
						return true;
					}
				}
			}
			soma = 0;
		}

		soma = 0;

		// varre vetical
		for (int coluna = 0; coluna < 3; coluna++) {
			for (int linha = 0; linha < 3; linha++) {
				soma += matrizGame[linha][coluna];
				if (linha == 2) {
					if (soma == 12) {
						return true;
					}

				}
			}
			soma = 0;
		}

		// diagonal
		if (matrizGame[0][0] + matrizGame[1][1] + matrizGame[2][2] == 12) {
			System.out.println("Verifica diagonal  true");
			return true;
		}

		if (matrizGame[0][2] + matrizGame[1][1] + matrizGame[2][0] == 12) {
			System.out.println("Verifica diagonal  true");
			return true;
		}

		soma = 0;
		return false;
	}

	public boolean OWin() {
		int soma = 0;

		// varre horizontal
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				soma += matrizGame[linha][coluna];
				if (coluna == 2) {
					if (soma == 3) {
						return true;
					}
				}
			}
			soma = 0;
		}

		soma = 0;

		// varre vetical
		for (int coluna = 0; coluna < 3; coluna++) {
			for (int linha = 0; linha < 3; linha++) {
				soma += matrizGame[linha][coluna];
				if (linha == 2) {
					if (soma == 3) {
						return true;
					}
				}
			}
			soma = 0;
		}

		// diagonal
		if (matrizGame[0][0] + matrizGame[1][1] + matrizGame[2][2] == 3)
			return true;
		if (matrizGame[0][2] + matrizGame[1][1] + matrizGame[2][0] == 3)
			return true;
		soma = 0;
		return false;
	}

	public Jogo() {
		inicializaJogo();
		// exibeMatrizConsole();
	}

	public void inicializaJogo() {

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matrizGame[linha][coluna] = 0;
			}
		}
	}

	public void exibeMatrizConsole() {

		for (int linha = 0; linha < 3; linha++) {
			System.out.print("{");
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matrizGame[linha][coluna] + " ,");
			}
			System.out.print("}");
			System.out.println();
		}
	}

	public void xJoga(int linha, int coluna) {

		matrizGame[linha][coluna] = 4;
		numeroJogadas++;
	}

	public void oJoga(int linha, int coluna) {
		matrizGame[linha][coluna] = 1;
		numeroJogadas++;
	}

	public int getNumeroJogadas() {
		return numeroJogadas;
	}

	public void setNumeroJogadas(int numeroJogadas) {
		this.numeroJogadas = numeroJogadas;
	}

}
