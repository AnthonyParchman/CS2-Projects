package unicornisland;

import java.util.Random;

public class Race {

	public static void main(String[] args) {
		System.out.println("Testing Please Ignore");
		int iterationsector1= 5
		int unicornspeed = 1;
		System.out.println("time in sector one is " + sector1(unicornspeed));


	}

	public static int sector1(int unicornspeed, int iterationsector1) {
		Random rand = new Random();
		int currentiterations = 0
		while  (int iterationsector1 < currentiterations)
		{

		int speed = (int) (rand.nextInt(15) + unicornspeed);

 		System.out.println("Speed in Sector one is " + speed);
		currentiterations++
		}

		if(speed < 5){

			System.out.println("there was a crash unicorn is down in sector 1");

		}else{

			System.out.println("Solid sector");
		}

		int timesector1 = 1000/speed;

		return timesector1;

	}

}
