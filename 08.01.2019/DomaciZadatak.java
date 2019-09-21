package osmipaket;

import java.util.Scanner;

public class DomaciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dani;
		int kolicina, musterija = 1, Capricciosa = 320, Pepperoni = 290, Vesuvio = 310;
		int racun = 0;

		System.out.println("Dobrodosli u Brasko++ pametnu kasu!");
		System.out.println();

		do {
			System.out.println("Koji je danas dan (Pon/Uto/Sre/Cet/Pet/Sub/Ned): ");
			dani = sc.nextLine();
			switch (dani) {
			case "Ponedeljak":
				break;
			case "Utorak":
				Vesuvio = (310 * 90) / 100;
				break;
			case "Sreda":
				break;
			case "Cetvrtak":
				Capricciosa = (320 * 90) / 100;
				break;
			case "Petak":
				break;
			case "Subota": {
				Capricciosa = (320 * 85) / 100;
				Pepperoni = (290 * 85) / 100;
				Vesuvio = (310 * 85) / 100;
			}
				break;
			case "Nedelja": {
				Capricciosa = (320 * 85) / 100;
				Pepperoni = (290 * 85) / 100;
				Vesuvio = (310 * 85) / 100;
			}
				break;
			default:
				System.out.println("Greska u unosu. Pokusajte ponovo: ");
				break;
			}
		} while (!dani.equals("Ponedeljak") && !dani.equals("Utorak") && !dani.equals("Sreda")
				&& !dani.equals("Cetvrtak") && !dani.equals("Petak") && !dani.equals("Subota")
				&& !dani.equals("Nedelja"));

		do {
			System.out.println("Musterija id#" + musterija + ": ");
			System.out.println();
			System.out.println("Unesite kolicinu: ");
			kolicina = sc.nextInt();
			if (kolicina == 0) {
				System.out.println("Unesite ponovo kolicinu.");
				continue;
			} else if (kolicina == -1)
				break;
			System.out.println("-- Racun za musteriju id#" + musterija + " ---");
			for (int i = 1; i <= kolicina; i++) {
				int id;
				System.out.println("Unesite broj pice koju zelite: ");
				id = sc.nextInt();

				while (id != 2 && id != 3 && id != 5) {
					System.out.println("Pogresan unos! Unesite ponovo");
					id = sc.nextInt();
				}
				switch (id) {
				case 2: {
					System.out.println("Pizza Capricciosa " + Capricciosa);
					racun += Capricciosa;
				}
					break;
				case 3: {
					System.out.println("Pizza Pepperoni " + Pepperoni);
					racun += Pepperoni;
				}
					break;
				case 5: {

					System.out.println("Pizza Vesuvio " + Vesuvio);
					racun += Vesuvio;
				}
					break;
				default:
					System.out.println("Pogresan unos!");
					break;
				}

			}

			System.out.println("\t Ukupno : " + racun);
			racun = racun - racun;
			musterija++;
		} while (kolicina != -1);
		System.out.println("Kraj programa!");

	}

}
