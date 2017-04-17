
package W17Project4StudentHelp;

public class NormalPerson extends Person {
	public NormalPerson(Eatery num1, int num2, int num3, int num4) {
		super(num1, num2, num3, num4);
	}

	@Override
	public void event(int tick) {
		if (tick >= leaveTime) {
			/** if they are in line too long... split*/
			KILL();
		}
		if (Sim.isInFront(this)) {
			/** if its in front, put it too a cashier */
			for (int i = 0; i < Sim.cashiers.size(); i++) {
				if (!Sim.cashiers.get(i).isFull()) {
					System.out.println("it happened");
					Sim.cashiers.get(i).add(this);
					break;
				}
			}
		}

	}

}
