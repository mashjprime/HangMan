
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
			display("\nPlease choose from the following");
			display("1. Play Game");
			display("2. Exit");
			selection = Integer.parseInt(sc.nextLine());
			
			switch (selection) {
			case 1:
				display("Playing Game");
				break;
			case 2:
				display("Closing application");
				playing = false;
				break;
			}
		}

	}
	
	public void display(String message) {
		System.out.println(message);
	}

	public HangMan() {
		display("Hello World, welcome to HangMan!");
		menu();
	}

	public static void main(String[] args) {
		HangMan hm = new HangMan();
	}

}
