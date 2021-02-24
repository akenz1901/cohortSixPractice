public class Mp3Player{

	private boolean powerOn;
	private int defaultVolume;
	private String defaultMusic;

	public Mp3Player(int isOn, int normalVolume, String firstMusic){
	
	if(isOn == 1)
	powerOn = true;
	
	if(normalVolume > 0 && powerOn == true)
	defaultVolume = normalVolume;

	if(powerOn == true)
	defaultMusic = firstMusic;
	}

	public  void setIsOn(boolean newPower){
	powerOn = newPower;
	}
	public boolean getIsOn(){
	return powerOn;
	}
	public void setDefaultVolume(int newVolume){
	defaultVolume = newVolume;
	}
	public int getDefaultVolume(){
	return defaultVolume;
	}
	public void setDefaultMusic(String playDefault){
	defaultMusic = playDefault;
	}

	public String getDefaultMusic(){
	return defaultMusic;
	}
	public void setControlVolume(int controlVolume){

	if(controlVolume == 1)
	defaultVolume++;
	
	else
	if(controlVolume == -1)
	defaultVolume--;

	
	else
	System.out.println("Ooops Invlaid input Button For changing Volume\n");
	defaultVolume = defaultVolume;
	
	}

	public int getControlVolume(){
	return defaultVolume;
	}
	
	public void setNewMusic(String selectMusic){
	defaultMusic = defaultMusic = selectMusic;
	}

	public String getNewMusic(){
	return defaultMusic;
	}
	
	
}
