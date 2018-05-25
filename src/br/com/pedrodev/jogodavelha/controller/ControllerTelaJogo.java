package br.com.pedrodev.jogodavelha.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import br.com.pedrodev.jogodavelha.domain.Jogo;
import br.com.pedrodev.jogodavelha.view.TelaJogo;

@SuppressWarnings("unused")
public class ControllerTelaJogo implements ActionListener {

	private TelaJogo tela;
	Jogo jogo;
	private static final String X_MOVE = "X";
	private static final String O_MOVE = "O";
	private String nextMove;

	public ControllerTelaJogo(TelaJogo tela) {

		this.tela = tela;
		initializeComponents();

	} // END CONSTRUCTOR

	public void addListener() {

		tela.getBtn00().addActionListener(this);
		tela.getBtn01().addActionListener(this);
		tela.getBtn02().addActionListener(this);
		tela.getBtn10().addActionListener(this);
		tela.getBtn11().addActionListener(this);
		tela.getBtn12().addActionListener(this);
		tela.getBtn20().addActionListener(this);
		tela.getBtn21().addActionListener(this);
		tela.getBtn22().addActionListener(this);
		tela.getBtnNewGame().addActionListener(this);
		tela.getBtnAbout().addActionListener(this);
		tela.getBtnExit().addActionListener(this);

	} // END FUNCTION

	public void initializeComponents() {
		addListener();
		disableAllButtons();

	} // END FUNCTION

	public void enableAllButtons() {
		tela.getBtn00().setEnabled(true);
		tela.getBtn01().setEnabled(true);
		tela.getBtn02().setEnabled(true);
		tela.getBtn10().setEnabled(true);
		tela.getBtn11().setEnabled(true);
		tela.getBtn12().setEnabled(true);
		tela.getBtn20().setEnabled(true);
		tela.getBtn21().setEnabled(true);
		tela.getBtn22().setEnabled(true);

	} // END FUNCTION

	public void disableAllButtons() {
		tela.getBtn00().setEnabled(false);
		tela.getBtn01().setEnabled(false);
		tela.getBtn02().setEnabled(false);
		tela.getBtn10().setEnabled(false);
		tela.getBtn11().setEnabled(false);
		tela.getBtn12().setEnabled(false);
		tela.getBtn20().setEnabled(false);
		tela.getBtn21().setEnabled(false);
		tela.getBtn22().setEnabled(false);

	} // END FUNCTION

	public void disableButton(JButton btn) {
		btn.setEnabled(false);
	}

	public void startGame() {
		enableAllButtons();
		nextMove = X_MOVE;
		clearButtons();

	} // END FUNCTION

	public void clearButtons() {
		tela.getBtn00().setText("");
		tela.getBtn01().setText("");
		tela.getBtn02().setText("");
		tela.getBtn10().setText("");
		tela.getBtn11().setText("");
		tela.getBtn12().setText("");
		tela.getBtn20().setText("");
		tela.getBtn21().setText("");
		tela.getBtn22().setText("");
	}

	@Override
	public void actionPerformed(ActionEvent eventClick) {

		if (eventClick.getSource() == tela.getBtnNewGame()) {
			enableAllButtons();
			jogo = new Jogo();
			startGame();
			tela.getTxtStatus().setText("Next Move : " + X_MOVE);

		} // END IF

		if (eventClick.getSource() == tela.getBtnAbout()) {
			JOptionPane.showMessageDialog(tela, "Developer : Pedro Costa\nVersão : 1.0");
		} // END IF

		if (eventClick.getSource() == tela.getBtnExit()) {
			System.exit(0);
		} // END IF

		if (eventClick.getSource() == tela.getBtn00()) {

			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(0, 0);
				jogo.exibeMatrizConsole();
				tela.getBtn00().setText("X");
				disableButton(tela.getBtn00());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(0, 0);
				jogo.exibeMatrizConsole();
				tela.getBtn00().setText("O");
				disableButton(tela.getBtn00());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}

		} // END IF

		if (eventClick.getSource() == tela.getBtn01()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(0, 1);
				jogo.exibeMatrizConsole();
				tela.getBtn01().setText("X");
				disableButton(tela.getBtn01());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(0, 1);
				jogo.exibeMatrizConsole();
				tela.getBtn01().setText("O");
				disableButton(tela.getBtn01());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn02()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(0, 2);
				jogo.exibeMatrizConsole();
				tela.getBtn02().setText("X");
				disableButton(tela.getBtn02());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(0, 2);
				jogo.exibeMatrizConsole();
				tela.getBtn02().setText("O");
				disableButton(tela.getBtn02());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn10()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(1, 0);
				jogo.exibeMatrizConsole();
				tela.getBtn10().setText("X");
				disableButton(tela.getBtn10());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(1, 0);
				jogo.exibeMatrizConsole();
				tela.getBtn10().setText("O");
				disableButton(tela.getBtn10());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn11()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(1, 1);
				jogo.exibeMatrizConsole();
				tela.getBtn11().setText("X");
				disableButton(tela.getBtn11());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(1, 1);
				jogo.exibeMatrizConsole();
				tela.getBtn11().setText("O");
				disableButton(tela.getBtn11());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn12()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(1, 2);
				jogo.exibeMatrizConsole();
				tela.getBtn12().setText("X");
				disableButton(tela.getBtn12());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(1, 2);
				jogo.exibeMatrizConsole();
				tela.getBtn12().setText("O");
				disableButton(tela.getBtn12());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn20()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(2, 0);
				jogo.exibeMatrizConsole();
				tela.getBtn20().setText("X");
				disableButton(tela.getBtn20());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(2, 0);
				jogo.exibeMatrizConsole();
				tela.getBtn20().setText("O");
				disableButton(tela.getBtn20());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn21()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(2, 1);
				jogo.exibeMatrizConsole();
				tela.getBtn21().setText("X");
				disableButton(tela.getBtn21());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;
			} else { // o joga
				jogo.oJoga(2, 1);
				jogo.exibeMatrizConsole();
				tela.getBtn21().setText("O");
				disableButton(tela.getBtn21());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (eventClick.getSource() == tela.getBtn22()) {
			if (nextMove.equals(X_MOVE)) { // x joga

				jogo.xJoga(2, 2);
				jogo.exibeMatrizConsole();
				tela.getBtn22().setText("X");
				disableButton(tela.getBtn22());
				tela.getTxtStatus().setText("Next Move : " + O_MOVE);

				nextMove = O_MOVE;

			} else { // o joga
				jogo.oJoga(2, 2);
				jogo.exibeMatrizConsole();
				tela.getBtn22().setText("O");
				disableButton(tela.getBtn22());
				tela.getTxtStatus().setText("Next Move : " + X_MOVE);

				nextMove = X_MOVE;
			}
		} // END IF

		if (jogo.XWin()) {
			tela.getTxtStatus().setText("X WIN");
			disableAllButtons();
		} else if (jogo.OWin()) {
			tela.getTxtStatus().setText("O WIN");
			disableAllButtons();
		} else {
			if (jogo.getNumeroJogadas() == 9)
				tela.getTxtStatus().setText("Draw");
		}

		System.out.println("\n" + jogo.getNumeroJogadas());
	} // END FUNCTION

}