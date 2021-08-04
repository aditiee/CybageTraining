package Abstraction;

public class Radio extends Machine {
	String command;
	
	
	public void toAccept()
	{
		command ="Start";
	}
	
	@Override
	public void toStart() {
		// TODO Auto-generated method stub
		if(command=="Start")
			System.out.println("RADIO STARTED....");
		else
			System.out.println("START THE RADIO!!");

	}

	@Override
	public void toPause() {
		if(command=="Pause")
			System.out.println("RADIO PAUSED....");
		else
			System.out.println("PAUSE THE RADIO!!");


	}

	@Override
	public void toStop() {
		if(command=="Stop")
			System.out.println("RADIO STOPPED....");
		else
			System.out.println("STOP THE RADIO!!");

	}

}
