package Multimediale;

import java.util.Scanner;

public abstract class Multimediale {
	private String titolo;

	public Multimediale(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void avviato() {

	}

	public void modificaSettaggi(Scanner in) {

	}

}
