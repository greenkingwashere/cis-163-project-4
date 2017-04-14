/**
 * 
 */
package W17Project4StudentHelp;

import java.util.ArrayList;

public class Eatery implements ClockListener {
	ArrayList<Person> Q = new ArrayList<Person>();

	private int timeOfNextEvent = 0;
	private int maxQlength = 0;
	private Person person; // this is the person at the Eatery.
	private int completed = 0;

	public void add(Person person) {
		Q.add(person);
		if (Q.size() > maxQlength)
			maxQlength = Q.size();
	}

	public void event(int tick) {
		if (tick >= timeOfNextEvent) {
			if (person != null) { // Notice the delay that takes place here
				// person.Destination.add(person); // take this person to the
				// next station.
				Sim.line.add(person);
				person = null; // I have send the person on.
			}

			if (Q.size() >= 1) {
				person = Q.remove(0); // do not send this person as of yet, make
										// them wait.
				timeOfNextEvent = tick + (int) (person.leaveTime + 1);
				completed++;
			}
		}
	}

	public int getLeft() {
		return Q.size();
	}

	public int getMaxQlength() {
		return maxQlength;
	}

	public int getThroughPut() {
		return completed;
	}
}
