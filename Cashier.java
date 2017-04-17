
package W17Project4StudentHelp;

public class Cashier implements ClockListener {

	static int numberCompleted = 0;
	private int timeOfNextEvent = 0;
	private Person customer;
	boolean ghost = false;

	public void add(Person pal) {
		/** add a person to the cashier */
		if (customer == null) {
			customer = pal;
			ghost = true;
			System.out.print("Added person: " + customer);
		}
	}

	public boolean isFull() {
		/** checks if there is someone in line*/
		if (customer != null)
			return true;
		else
			return false;
	}

	@Override
	public void event(int tick) {
		if (ghost) {
			timeOfNextEvent = tick + customer.cashiersTime;
			ghost = false;
		}
		if (timeOfNextEvent >= tick) {
			// numberCompleted++;
			customer = null;

		}
	}

}
