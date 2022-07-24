package Multimediale;

import java.util.Scanner;

public class Immagine extends Multimediale implements Luminosita {
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	public void modificaSettaggi(Scanner in) {
		int luminosita;
		System.out.println("Inserire nuovo valore di Luminosità per " + getTitolo());
		luminosita = in.nextInt();
		in.nextLine();
		if (this.luminosita > luminosita)
			menoLuminoso(luminosita);
		else
			piuLuminoso(luminosita);
	}

	public void mostra() {
		String asterischi = "";
		for (int a = 0; a < this.luminosita; a++) {
			asterischi += "*";
		}
		System.out.println(getTitolo() + " " + asterischi);
	}

	public void piuLuminoso(int bright) {
		if (bright > this.luminosita)
			this.luminosita = bright;
		else
			System.out.println("valore inserito inferiore o uguale");
	}

	public void menoLuminoso(int dark) {
		if (dark < this.luminosita)
			this.luminosita = dark;
		else
			System.out.println("valore inserito superiore o uguale");
	}

}
