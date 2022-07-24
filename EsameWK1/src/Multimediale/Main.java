package Multimediale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titolo;
		int initialVolume = 8; // scegliere
		int initialLuminosita = 5; // scegliere
		int tipologia, durata;

		System.out.println("LETTORE MULTIMEDIALE");
		
		Scanner stampa = new Scanner(System.in);
		Multimediale[] multi = new Multimediale[5];
		for (int i = 0; i < 5; i++) {
			// flag variabile booleana//
			boolean veroFalso = true;
			while (veroFalso) {
				System.out.println("(1 Immagine 2 Audio 3 Video)");
				System.out.println("inserito  " + i + " file");
				tipologia = stampa.nextInt();
				stampa.nextLine();
				switch (tipologia) {

				case 1:
					System.out.println("Inserire titolo immagine.");
					titolo = stampa.nextLine();
					multi[i] = new Immagine(titolo, initialLuminosita);
					veroFalso = false;
					break;
				case 2:
					System.out.println("Inserire titolo Audio. ");
					titolo = stampa.nextLine();
					System.out.println("Inserire durata Audio " + titolo + ".");
					durata = stampa.nextInt();
					stampa.nextLine();
					multi[i] = new Audio(titolo, initialVolume, durata);
					veroFalso = false;
					break;
				case 3:
					System.out.println("Inserire titolo Video. ");
					titolo = stampa.nextLine();
					System.out.println("Inserire durata Video " + titolo + ".");
					durata = stampa.nextInt();
					stampa.nextLine();
					multi[i] = new Filmato(titolo, initialLuminosita, initialVolume, durata);
					veroFalso = false;
					break;
					default:
					System.out.println("Selezione errata! ");
					break;
				}
			}
		}

		// Fine inizializazzione menu

		int scelta = 0;
		while (true) {

			System.out.println("Scegli un elemento multimediale da 1-5. Inserisci 0 per uscire!");
			System.out.println("=============");
			System.out.println("    MENU   ");
			for (int i = 0; i < 5; i++) {

				System.out.println((i + 1) + ")" + multi[i].getTitolo());
			}

			System.out.println("=============");

			scelta = stampa.nextInt();
			stampa.nextLine(); 
			if (scelta == 0)
				System.exit(0);
			System.out.println("exit");

			multi[scelta - 1].avviato();
			System.out.println("modificare qualcosa del file multimediale? [Y/N]");
			String choice = stampa.nextLine();
			if (choice.equals("Y"))
				multi[scelta - 1].modificaSettaggi(stampa);
		}
	}

}
