package br.com.pedrodev.jogodavelha.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import br.com.pedrodev.jogodavelha.view.TelaJogo;

@SuppressWarnings("unused")
public class ControllerTelaJogo implements ActionListener {

	private TelaJogo tela;
	private static final char X_MOVE = 'X';
	private static final char O_MOVE = 'O';
	private char nextMove;

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

	} // END FUNCTION

	@Override
	public void actionPerformed(ActionEvent eventClick) {

		if (eventClick.getSource() == tela.getBtnNewGame()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtnAbout()) {
			JOptionPane.showMessageDialog(tela, "Developer : Pedro Henrique\nVersão : 1.0");
		} // END IF

		if (eventClick.getSource() == tela.getBtnExit()) {
			System.exit(0);
		} // END IF

		if (eventClick.getSource() == tela.getBtn00()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn01()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn02()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn10()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn11()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn12()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn20()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn21()) {

		} // END IF

		if (eventClick.getSource() == tela.getBtn22()) {

		} // END IF

	} // END FUNCTION

}