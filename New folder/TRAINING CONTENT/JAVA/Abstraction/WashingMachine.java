package Abstraction;

public class WashingMachine extends Machine {

	@Override
	public void toStart() {
	if(timer==0 && timer==startTime)
		System.out.println("WASHING MACHINE STARTED.....");
	else
		System.out.println("NOT STARTED!!");
	}

	@Override
	public void toPause() {
		System.out.println("PAUSED!!");
		
		
	}

	@Override
	public void toStop() {
		if(timer==endTime)
			System.out.println("WASHING MACHINE STARTED.....");
		else
			System.out.println("NOT STARTED!!");
		}

	
}
