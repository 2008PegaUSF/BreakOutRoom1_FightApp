package menu;

import java.sql.SQLException;
import java.util.Scanner;

import daoImplements.implementFighterDao;
import daoImplements.implementPlayerDao;

public class menu {

	static implementFighterDao f = new implementFighterDao();
	static implementPlayerDao p = new implementPlayerDao();

		
	static Scanner scan = new Scanner(System.in);
	public static void startMenu() {
		System.out.println("Welcome To Roll Tide Fight Club");
		System.out.println("Please Select An Option Below...");
		System.out.println("1. Fight.");
		System.out.println("2. Quit.");
		int choiceInput = scan.nextInt();
		
		
		switch(choiceInput) {
		
		case 1:
			fightMenu();
			break;
		case 2:
			try {
				p.increaseRecords(1, 2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Roll Tide");
			break;
		default:
			System.out.println("Try Again...");
			startMenu();
			break;
		}
		
	}
	public static void fightMenu() {
		// TODO Auto-generated method stub
		
	}
	

}
