package main.java.pucrs.s2b.test;

import main.java.pucrs.s2b.test.ControllerTelaJogo;
import main.java.pucrs.s2b.test.TelaJogo;

public class Programa {
	public static void main(String[] args) {
		TelaJogo t = new TelaJogo();
		t.setVisible(true);
		t.pack();
		ControllerTelaJogo c = new ControllerTelaJogo(t);

	}

}
