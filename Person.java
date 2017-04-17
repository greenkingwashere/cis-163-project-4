
package W17Project4StudentHelp;

public abstract class Person implements ClockListener {
	int tickTime;
	Eatery Destination;
	protected int cashiersTime;
	protected int leaveTime;
	protected int eateryTime;

	public Person(Eatery num1, int num2, int num3, int num4) {
	
		tickTime = 0;
		Destination = num1;
		cashiersTime = num2;
		leaveTime = num3;
		eateryTime = num4;
	}

	public void KILL() {
		Sim.line.remove(this);

	}
}
