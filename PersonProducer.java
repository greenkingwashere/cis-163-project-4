/**
 * 
 */
package W17Project4StudentHelp;

import java.util.Random;

/**
 * @author Roger Ferguson
 */
public class PersonProducer implements ClockListener {
	
	private int nextPerson = 0;
	private Eatery eatery;
	private int numOfTicksNextPerson;
	private int averageEateryTime;
	
	private Random r = new Random();
	
	public PersonProducer(Eatery eatery, 
			int numOfTicksNextPerson, 
			int averageEateryTime) {
		
		this.eatery = eatery;
		this.numOfTicksNextPerson = numOfTicksNextPerson;
		this.averageEateryTime = averageEateryTime;
		//r.setSeed(13);    // This will cause the same random numbers
	}
	
	public void event(int tick) {
		if (nextPerson <= tick) { //if the time to add another person has arrived
			nextPerson = tick + numOfTicksNextPerson; //set the time of the next person to arrive
			
			Person person = new NormalPerson(eatery,Sim.cashTime(),Sim.leavingTime(), Sim.eateryTiming());
			
			int rNumber = (int)(Math.random() * 100);

			person.eateryTime = (int) (averageEateryTime*0.5*r.nextGaussian() + averageEateryTime +.5); //some randomness stuff?
			person.tickTime = (tick);
			eatery.add(person);
			
		//	person.setDestination(theLocationAfterTheEatery);  // You can save off where the person should go.
		}
	}

}
