package lambdaexp;

public class RunnableDemo {

	public static void main(String[] args) {
				
		new Thread(
				()->{ for(int i=0;i<5;i++) {
					if(i%2==0)
						System.out.println(i+" is even"+Thread.currentThread());
					try {
						Thread.sleep(1000);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("Odd "+ i);
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
				}
				)
		.start();
		new  Thread(
				()->System.out.println("Executing thread: "+Thread.currentThread())
				)
		.start();

}
	}


