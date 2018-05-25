package br.com.pedrodev.main;

import br.com.pedrodev.jogodavelha.controller.ControllerTelaJogo;
import br.com.pedrodev.jogodavelha.view.TelaJogo;

public class Programa {
	public static void main(String[] args) {
		TelaJogo t = new TelaJogo();
		t.setVisible(true);
		t.pack();
		ControllerTelaJogo c = new ControllerTelaJogo(t);

	}

}
