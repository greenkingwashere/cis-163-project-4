
package W17Project4StudentHelp;

/**
 * @author Roger Ferguson
 *
 */
public class Sim {
	
	public static void main (String[] args) {
			
			Clock clk = new Clock();
			Eatery booth = new Eatery();
			
			PersonProducer produce = new PersonProducer(booth, 20, 18);	
			clk.add(produce);
			clk.add(booth);
			
			clk.run(10000);
			
			System.out.println("Through put is: " + booth.getThroughPut() + " people.");
			System.out.println("People that are still in the Q:" + booth.getLeft() + " people.");
			System.out.println ("Max Q length:" + booth.getMaxQlength() + " people.");
		}
	//these are for grabbing variables pre-gui, ignore these
	public static int cashTime(){return 20;}
	public static int leavingTime(){return 150;}
	public static int eateryTiming(){return 15;}
}
