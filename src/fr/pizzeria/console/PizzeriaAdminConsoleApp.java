package fr.pizzeria.console;

import java.util.Scanner;

/**
 * @author Thomas
 * 
 * 
 */
public class PizzeriaAdminConsoleApp {

	static String[][] listePizza = new String[50][];

	static Scanner questionUser = new Scanner(System.in);

	/**
	 *  Affichage du menu principal et gestion du tableau des pizzas
	 */
	public static void main(String args[]) {

		initPizzas();
		int choixMenu = 0;

		do {

			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choixMenu = questionUser.nextInt();

			switch (choixMenu) {

			case 1:

				listeDesPizzas();

				break;

			case 2:

				ajoutPizza();

				break;

			case 3:

				upDatePizza();

				break;

			case 4:

				supprimerPizza();

				break;

			case 99:
				System.out.println("Aurevoir");
				break;

			default:
				System.out.println("Veuillez saisir un numero de menu valide");
			}
		} while (choixMenu != 99);
	}

	/**
	 * Initialisation du tableau des pizzas
	 */
	private static void initPizzas() {

		listePizza[0] = new String[] { "0", "PEP", "Pépéroni", "12.50" };
		listePizza[1] = new String[] { "1", "MAR", "Margherita", "14.00" };
		listePizza[2] = new String[] { "2", "REI", "La Reine", "11.50" };
		listePizza[3] = new String[] { "3", "FRO", "La 4 fromage", "12.00" };
		listePizza[4] = new String[] { "4", "CAN", "La cannibale", "12.50" };
		listePizza[5] = new String[] { "5", "SAV", "La savoyarde", "13.00" };
		listePizza[6] = new String[] { "6", "ORI", "L'orientale", "13.50" };
		listePizza[7] = new String[] { "7", "IND", "L'indienne", "14.00" };

	}

	/**
	 * Affichage de la liste des Pizzas
	 */
	private static void listeDesPizzas() {

		System.out.println("1. Liste des pizzas");

		for (int i = 0; i < listePizza.length; i++) {

			if (listePizza[i] != null && !listePizza[i][1].equals(null)) {

				System.out.print(listePizza[i][1] + " -> " + listePizza[i][2] + " (" + listePizza[i][3] + ")");

				System.out.println(" ");
			}
		}

		System.out.println(" ");
	}

	/**
	 * Ajout d'une nouvelle pizza dans le tableau
	 */
	private static void ajoutPizza() {

		System.out.println("2. Ajout d'une nouvelle pizza");

		System.out.println("veuillez saisir le code");
		String code = questionUser.next();

		System.out.println("veuillez saisir le nom (sans espace)");
		String nomPizza = questionUser.next();

		System.out.println("veuillez saisir le prix");
		String prix = questionUser.next();

		for (int i = 0; i < listePizza.length; i++) {

			if (listePizza[i] == null) {

				listePizza[i] = new String[] { Integer.toString(i), code, nomPizza, prix };
				System.out.println("Pizza ajoutée");
				System.out.println("");
				break;

			}
		}
	}

	/**
	 * Mise à jour d'une pizza dans le tableau
	 */
	private static void upDatePizza() {

		System.out.println("3. Mettre à jour une pizza");

		listeDesPizzas();

		System.out.println("veuillez saisir le code");
		String codeUpDate = questionUser.next();

		System.out.println("veuillez saisir le code");
		String code = questionUser.next();

		System.out.println("veuillez saisir le nom (sans espace)");
		String nomPizza = questionUser.next();

		System.out.println("veuillez saisir le prix");
		String prix = questionUser.next();
		if (!code.equals("99")) {
			for (int i = 0; i < listePizza.length; i++) {

				if (listePizza[i] != null && codeUpDate.equals(listePizza[i][1])) {

					listePizza[i] = new String[] { Integer.toString(i), code, nomPizza, prix };

				}
			}

			System.out.println("Pizza mise à jour");
			System.out.println("");
		}
	}

	/**
	 * Suppression d'une pizza dans le tableau
	 */
	private static void supprimerPizza() {

		System.out.println("4. Suppréssion d'une pizza");

		listeDesPizzas();

		System.out.println("veuillez saisir le code");
		String code = questionUser.next();
		if (!code.equals("99")) {
			for (int i = 0; i < listePizza.length; i++) {

				if (listePizza[i] != null && code.equals(listePizza[i][1]) ) {
					listePizza[i] = new String[] { null, null, null, null };
					break;
				}
			}

			System.out.println("Pizza supprimée");
			System.out.println("");

		}
	}
}