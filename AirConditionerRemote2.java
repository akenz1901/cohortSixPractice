import java.util.Scanner;
public class AirConditionerRemote2{

	public static void main(String... args){
		
		Scanner collector = new Scanner(System.in);

		AirConditioner productName = new AirConditioner();
		
		productName.prepareProductName("Yamaha");

		String newProduct = productName.provideProductName();
		
		System.out.printf("The product name is %s%n ", newProduct);


		AirConditioner newOn = new AirConditioner();

		newOn.goneOff(true);
		boolean putOn = newOn.getPower();
		
		System.out.println("The AirConditioner is Off" );

		System.out.print("Put the Ac on: ");
		boolean isAlive = collector.nextBoolean();
		System.out.println();

		if (isAlive = true)
		System.out.printf("It is On Now: %s%n", newOn.getPower());


		System.out.print("Enter Tempertaure: ");
		int exactTemperature = collector.nextInt();

		AirConditioner temperatureRemote = new AirConditioner();
	
		temperatureRemote.setTemperature(exactTemperature);
		
		int inputTemperature = temperatureRemote.getTemperature();
		
		if (exactTemperature > 16)
		System.out.printf("Invalid input,\nThe highest tempertaure is 16 \n");
		
		
		if (exactTemperature <= 16)
		System.out.printf("Temprature set %s%n ", exactTemperature);


	}

}