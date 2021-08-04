package oops;

public class WashingMachine extends Machine {

	
	@Override
	public boolean toStart() {
		// TODO Auto-generated method stub
		if(timer==0 && timer==startTime)
		return true;
		else
		return false;
	}

	@Override
	public boolean toStop() {
		// TODO Auto-generated method stub
		if(timer==endTime)
			return true;
			else
			return false;
	}

	@Override
	public boolean toPause() {
		// TODO Auto-generated method stub
		if(timer==10)
			return true;
			else
			return false;
	}

}
