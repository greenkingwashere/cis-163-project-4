
package W17Project4StudentHelp;

import java.util.ArrayList;
import java.util.Scanner;

public class Sim {
	static ArrayList<Person> line;
	static ArrayList<Eatery> stores;
	static ArrayList<PersonProducer> producers;
	static ArrayList<Cashier> cashiers;
	static Clock clk;

	public static boolean isInFront(Person pal) { // test this
		System.out.println("isinfront");
		try {
			if (line.get(0) == pal)
				return true;
			else
				return false;
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			return false;
		}

	}

	public static void main(String[] args) {
		// GUI goo = new GUI();
		line = new ArrayList<Person>(); // middle line of people going to the
										// cashiers
		stores = new ArrayList<Eatery>(); // all eateries
		producers = new ArrayList<PersonProducer>();
		cashiers = new ArrayList<Cashier>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Num of eateries:");
		int num = scan.nextInt();

		clk = new Clock();

		for (int i = 0; i < num; i++) {
			stores.add(new Eatery());
			producers.add(new PersonProducer(stores.get(i), 20, 18));
			clk.add(producers.get(i));
			clk.add(stores.get(i));
		}

		System.out.print("Num of cashiers:");
		num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			cashiers.add(new Cashier());
			clk.add(cashiers.get(i));
		}

		System.out.println("Debug? (0/1):");
		int finite = scan.nextInt();
		if (finite == 1) {
			System.out.println("Stores: " + stores);
			System.out.println("Producers: " + producers);
		}

		Eatery booth = new Eatery();

		int numOfTicksNextPerson = 20;
		int averageBoothTime = 20;

		clk.run(10000);

		System.out.println("Line: " + line);
		System.out.println("Cashier: " + cashiers);
		System.out.println("Through put is: " + stores.get(0).getThroughPut() + " people.");
		System.out.println("People that are still in the Q:" + stores.get(0).getLeft() + " people.");
		System.out.println("Max Q length:" + stores.get(0).getMaxQlength() + " people.");
	}

	// these are for grabbing variables pre-gui, ignore these
	public static int cashTime() {
		return 20;
	}

	public static int leavingTime() {
		return 150;
	}

	public static int eateryTiming() {
		return 15;
	}
}
