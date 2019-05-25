
/**
 * Welcome to HangMan!! This is my first independent Java project committed to
 * git
 * 
 * @author Mash J Prime
 *
 */
import java.util.Scanner;

public class HangMan {

	private static final Scanner sc = new Scanner(System.in);

	public void menu() {
		boolean playing = true;
		int selection = 0;
		while (playing) {
			System.out.println("\nPlease choose from the following");
			System.out.println("1. Play Game");
			System.out.println("2. Exit");
			selection = Integer.parseInt(sc.nextLine());
			
			switch (selection) {
			case 1:
				System.out.println("Playing Game");
				break;
			case 2:
				System.out.println("Closing application");
				playing = false;
				break;
			}
		}

	}

	public HangMan() {
		System.out.println("Hello World, welcome to HangMan!");
		menu();
	}

	public static void main(String[] args) {
		HangMan hm = new HangMan();
	}

}
