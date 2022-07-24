package Multimediale;

import java.util.Scanner;

public class Filmato extends Multimediale implements Volume, Luminosita {
	private int luminosita;
	private int volume;
	private int durata;

	public Filmato(String titolo, int luminosita, int volume, int durata) {
		super(titolo);
		this.luminosita = luminosita;
		this.volume = volume;
		this.durata = durata;
	}

	public void modificaSettaggi(Scanner in) {
		int luminosita, volume;
		System.out.println("Inserire nuovo valore di Luminosità per " + getTitolo());
		luminosita = in.nextInt();
		in.nextLine();
		if (this.luminosita > luminosita)
			menoLuminoso(luminosita);
		else
			piuLuminoso(luminosita);

		System.out.println("Inserire il nuovo valore di Volume per " + getTitolo());
		volume = in.nextInt();
		in.nextLine();
		if (this.volume > volume)
			abassa(volume);
		else
			alza(volume);
	}

	public void riproduci() {
		String asterischi = "";
		String esclamativo = "";
		String durata = "";
		for (int a = 0; a < this.luminosita; a++) {
			asterischi += "*";
		}
		for (int a = 0; a < this.volume; a++) {
			esclamativo += "!";
		}
		for (int a = 0; a < this.durata; a++) {
			durata += getTitolo();
		}
		System.out.println(durata + " " + esclamativo + " " + asterischi);
	}

	public void piuLuminoso(int piuLum) {
		this.luminosita = piuLum;

	}

	public void menoLuminoso(int piuScuro) {
		this.luminosita = piuScuro;

	}

	public void abassa(int bass) {
		this.volume = bass;

	}

	public void alza(int alz) {
		this.volume = alz;
	}

}
