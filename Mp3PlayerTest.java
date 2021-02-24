import java.util.Scanner;
public class Mp3PlayerTest{

	public static void main(String[] args){
	Scanner collector = new Scanner(System.in);

	Mp3Player newPlayer = new Mp3Player(1, 23, "Makosa"); 
	System.out.printf(" **Power On** %s%n%n Volume sets %d%n%n Music plays Randomly %s%n%n ", newPlayer.getIsOn(), 
	newPlayer.getDefaultVolume(), newPlayer.getDefaultMusic());
	
	newPlayer.setControlVolume(4);
	int controlVolume = newPlayer.getControlVolume();
	System.out.println(" Volume Increases or Decreases to " + newPlayer.getControlVolume());
	
	String next = "\"Thank You Jesus\"";
	String previous = "\"This World is Beautiful\"";
	newPlayer.setNewMusic(next);
	String selectMusic = newPlayer.getNewMusic();
	System.out.println("\n Music Changes " + newPlayer.getNewMusic());
	}
}
