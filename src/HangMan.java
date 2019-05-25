
/**
 * Welcome to HangMan!! This is my first independent Java project committed to
 * git
 * 
 * @author Mash J Prime
 *
 */
import java.io.*;
import java.util.Scanner;

public class HangMan {
	private static final Scanner sc = new Scanner(System.in);

	// Menu System
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
				saveToDatabase();
				playing = false;
				break;
			}
		}

	}

	// Load from database
	public static void loadFromDatabase() {
		BufferedReader inFile = null;
		try {
			inFile = new BufferedReader(new FileReader("database.csv"));
			String currLine = inFile.readLine();
			while (currLine != null) {
				display(currLine);
				// String[] read = currLine.split(",");
				currLine = inFile.readLine();
			}
			inFile.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Save to database
	public static void saveToDatabase() {
		BufferedWriter outFile = null;
		try {
			outFile = new BufferedWriter(new FileWriter("database.csv"));
			outFile.write("Data\nTest");
			outFile.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Change output method
	public static void display(String message) {
		System.out.println(message);
	}

	public HangMan() {
		display("Hello World, welcome to HangMan!");
		loadFromDatabase();
		menu();
	}

	public static void main(String[] args) {
		HangMan hm = new HangMan();
	}

}
