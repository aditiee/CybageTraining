package Abstraction;

public abstract class Machine {
	
	int timer;
	int startTime;
	int endTime;
	
	public abstract void toStart();
	public abstract void  toPause();
	public abstract void toStop();

}
