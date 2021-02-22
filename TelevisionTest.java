import java.util.Scanner;

public class TelevisionTest{

	public static void main(String... args){
	Scanner collector = new Scanner(System.in);	

	System.out.print("Put Television on: ");
	boolean power = collector.nextBoolean();
	System.out.println();

	Television ourNewTelevision = new Television(" Samsung", 2025, power, 20, 25, 0);
	
	System.out.printf(" The Product Name is %s%n%n Product Year is %d%n%n ", ourNewTelevision.getProductName(), ourNewTelevision.getProductYear());

	if (power == true)
	System.out.println("ScreenSize 1800/1600\n\n **Power On**\n");
	
	System.out.printf(" Channel displays %d%n%n Volume Set %d%n%n ", ourNewTelevision.getDefaultChannel(), ourNewTelevision.getDefaultVolume());
	
	System.out.print("Change Channel: ");
	int newChannel = collector.nextInt();
	System.out.println();
	ourNewTelevision.setChangeChannel(newChannel);

	int channelNew = ourNewTelevision.getChangeChannel();
	
	System.out.printf(" Increasing Volume %d%n%n New Input Channel is SuperSport and it is Channel %d%n", ourNewTelevision.getIncreaseVolume(), ourNewTelevision.getChangeChannel());
	
	}
}