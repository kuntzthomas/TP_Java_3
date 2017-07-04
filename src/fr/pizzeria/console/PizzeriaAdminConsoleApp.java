package fr.pizzeria.console;

import java.util.Scanner;

/**
 * @author ETY19
 *
 */
public class PizzeriaAdminConsoleApp {
	
	static String[][] listePizza = new String[8][];
	static String[][] commande = new String[50][];

	public static void main(String args[]) {
		
		initPizzas();

		// Affichage du menu principal
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");

		// Choix menu
		Scanner questionUser = new Scanner(System.in);
		int choixMenu = questionUser.nextInt();

		switch (choixMenu) {

		case 1:
			System.out.println("1. Liste des pizzas");
			for (int i=0 ; i < listePizza.length ; i++) {
				for (int j=0 ; j < listePizza[i].length; j++){
					System.out.print(listePizza[i][j] + " ");
				}
				System.out.println(" ");
			}
			Scanner questionUser1 = new Scanner(System.in);
			int choixMenu1 = questionUser.nextInt();
			
			
			main(args);
			break;

		case 2:
			System.out.println("2. Ajout d'une nouvelle pizza");
			main(args);
			break;

		case 3:
			System.out.println("3. Mise à jour d'une pizza");
			main(args);
			break;

		case 4:
			System.out.println("4. Suppréssion d'une pizza");
			main(args);
			break;

		case 99:
			System.out.println("Aurevoir");
			main(args);
			break;

		default:
			System.out.println("Veuillez entrer un numero de menu valide");
			main(args);
		}

	}

	private static void initPizzas() {
		
		listePizza[0] = new String[]{"0", "PEP", "Pépéroni", "12.50"};
		listePizza[1] = new String[]{"1", "MAR", "Margherita", "14.00"};
		listePizza[2] = new String[]{"2", "REI", "La Reine", "11.50"};
		listePizza[3] = new String[]{"3", "FRO", "La 4 fromage", "12.00"};
		listePizza[4] = new String[]{"4", "CAN", "La cannibale", "12.50"};
		listePizza[5] = new String[]{"5", "SAV", "La savoyarde", "13.00"};
		listePizza[6] = new String[]{"6", "ORI", "L'orientale", "13.50"};
		listePizza[7] = new String[]{"7", "IND", "L'indienne", "14.00"};

	}
}
