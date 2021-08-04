package oops;

public class Radio extends Machine {

	String command;
	
	public void toaccept(){
		command="Start";
	}
	
	@Override
	public boolean toStart() {
		// TODO Auto-generated method stub
		if(command=="Start")
		return true;
		else 
			return false;
	}

	@Override
	public boolean toStop() {
		// TODO Auto-generated method stub
		if(command=="Stop")
			return true;
			else 
				return false;
	}

	@Override
	public boolean toPause() {
		// TODO Auto-generated method stub
		if(command=="Pause")
			return true;
			else 
				return false;
	}

}
