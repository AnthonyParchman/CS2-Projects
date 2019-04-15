package unicornisland;

import java.util.Random;

public class Race {

	public static void main(String[] args) {
		System.out.println("Testing Please Ignore");
		
		int unicornspeed = 1;
		System.out.println("time in sector one is " + sector1(unicornspeed));
		

	}

	public static int sector1(int unicornspeed) {
		Random rand = new Random();
		
		int speed = (int) (rand.nextInt(15) + unicornspeed);
		
		System.out.println("Speed in Sector one is " + speed);
		
		if(speed < 5){
			
			System.out.println("there was a crash unicorn is down in sector 1");
		
		}else{
			
			System.out.println("Solid sector");
		}
		
		int timesector1 = 1000/speed;
		
		return timesector1;
		
	}

}
