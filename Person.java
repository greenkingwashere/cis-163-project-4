/**
 * 
 */
package W17Project4StudentHelp;

public abstract class Person implements ClockListener {
	int tickTime;
	Eatery Destination;
	protected int cashiersTime;
	protected int leaveTime;
	protected int eateryTime;

	// public abstract void setCashiersTime(int time);
	// public abstract void setLeaveTime(int time);
	// public abstract void setEateryTime(int time);

	public Person(Eatery num1, int num2, int num3, int num4) {
		/**
		 * @param num1
		 *            the Eatery the person is going to
		 * @param num2
		 *            the time for cashier
		 * @param num3
		 *            the leave time
		 * @param num4
		 *            the eatery time
		 *
		 * 
		 **/
		tickTime = 0;
		Destination = num1;
		cashiersTime = num2;
		leaveTime = num3;
		eateryTime = num4;
	}

	public void KILL() {// kill the person
		Sim.line.remove(this);

	}
}

/**
 * public double getLeaveTime() { return leaveTime; } public Eatery
 * getDestination() { return Destination; } public void setDestination(Eatery
 * destination) { Destination = destination; } public int getTickTime() { return
 * tickTime; } public void setTickTime(int tickTime) { this.tickTime = tickTime;
 * } public void setEateryTime(double time) { this.leaveTime = (int) time; }
 */
