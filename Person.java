 /**
 * 
 */
package W17Project4StudentHelp;

/**
 * @author   Roger Ferguson
 */
public abstract class Person implements ClockListener{

	private int tickTime;

	private Eatery Destination;

	
	protected int cashiersTime;
	protected int leaveTime;
	protected int eateryTime;
	

	// max time person stays in line

	protected double boothTime;

	
	
	
	public abstract void setCashiersTime(int time);
	public abstract void setLeaveTime(int time);
	public abstract void setEateryTime(int time);
	
	
	
	public Person(Eatery num1, int num2, int num3, int num4, double num5){
		
		/**@param num1 the Eatery the person is going to
		 * @param num2 the time for cashier
		 * @param num3 the leave time
		 * @param num4 the eatery time
		 * @param num5 the booth time
		 *      
		 **/
		
		
		tickTime = 0;
		Destination = num1;
		cashiersTime = num2;
		leaveTime = num3;
		eateryTime = num4;
		boothTime = num5;
		
		
	}
	
	

	public double getBoothTime() {

		return boothTime;

	}

	

	public Eatery getDestination() {

		return Destination;

	}



	public void setDestination(Eatery destination) {

		Destination = destination;

	}

	

	public int getTickTime() {

		return tickTime;

	}



	public void setTickTime(int tickTime) {

		this.tickTime = tickTime;

	}



	public void setEateryTime(double time) {

		this.boothTime = time;

	}

}
