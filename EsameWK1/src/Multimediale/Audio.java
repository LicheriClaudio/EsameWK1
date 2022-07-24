package Multimediale;

import java.util.Scanner;

public class Audio extends Multimediale implements Volume {
	private int volume;
	private int durata;

	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;

	}

	public void avviato() {
		riproduci();
	}

	
	public void modificaSettaggi(Scanner in) {

		int volume = 0;
		System.out.println("Inserire il nuovo valore di Volume per " + getTitolo());
		volume = in.nextInt();
		in.nextLine();
		if (this.volume > volume)
			abassa(volume);
		else
			alza(volume);
	}

	public void riproduci() {
		String esclamativo = "";
		String durata = "";
		for (int a = 0; a < this.volume; a++) {
			esclamativo += "!";
		}
		for (int a = 0; a < this.durata; a++) {
			durata += getTitolo();
		}
		System.out.println(durata + " " + esclamativo);
	}

	public void abassa(int bss) {
		this.volume = bss;

	}

	public void alza(int alz) {
		this.volume = alz;

	}

}
