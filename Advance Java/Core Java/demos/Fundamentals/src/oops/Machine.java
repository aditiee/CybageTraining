package oops;

public abstract class Machine {

	int timer;
	int startTime;
	int endTime;
	
	
	public abstract boolean toStart();
	
	public abstract boolean toStop();
	
	public abstract boolean toPause();
	
}
