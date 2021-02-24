public class Television{

	private String productName;
	private int productYear;
	private boolean isOn;
	private int defaultChannel;
	private int defaultVolume;

		public Television(String newProductName, int newProductYear, boolean isItOn, int newDefaultChannel, int newDefaultVolume, int increaseVolume){
	
		productName = newProductName;
		
		productYear = newProductYear;

		if (isItOn == true)
		isOn = isItOn;
		
		if (newDefaultChannel > 0 && isItOn == true)
		defaultChannel = newDefaultChannel;
		
		if (newDefaultVolume > 0 && isItOn == true)
		defaultVolume = newDefaultVolume;
		
		if (increaseVolume > 30 && isItOn == true)
		defaultVolume = increaseVolume;

		//if (decreaseVolume < increaseVolume || decreaseVolume < defaultVolume && isItOn == true)
		//defaultVolume = decreaseVolume;

		}

		public void setProductName(String name){
		productName = name;
		}

		public String getProductName(){
		return productName;
		}
		
		public void setProductYear(int year){
		productYear = year;
		}

		public int getProductYear(){
		return productYear;
		}

		public void setIsOn(boolean isAlive){
		isOn = isAlive;
		}

		public boolean getIsOn(){
		return isOn;
		}
		
		public void ChangeChannel(int changeChannel){
		if (changeChannel > 0)
		defaultChannel = defaultChannel + changeChannel;
		}

		public int getDefaultChannel(){
		return defaultChannel;
		}

		public void setDefaultVolume(int volume){
		defaultVolume = volume;
		}

		public int getDefaultVolume(){
		return defaultVolume;
		}

		public void setIncreaseVolume(int increaseVolume){
		defaultVolume = increaseVolume;
		}

		public int getIncreaseVolume(){
		return defaultVolume +1;
		}
		
		public void setChangeChannel(int newChannel){
		if (newChannel <= 30)
		defaultChannel = defaultChannel = newChannel;
		}
				
		public int getChangeChannel(){
		return defaultChannel;
		}
	}