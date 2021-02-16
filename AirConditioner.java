public class AirConditioner{

	private String product;
	private int temperature;
	private boolean isOn;

		public void prepareProductName(String newProduct){
		
		product = newProduct;

		}
		
		public String provideProductName(){


		return product;
		}

		public void setTemperature(int inputTemperature){

		temperature = inputTemperature;
		}

		public int getTemperature(){
		
		return temperature;

		}
		public void goneOff(boolean putOn){
		
		isOn = putOn;
		}
		
		public boolean getPower(){

		return isOn;

		}

}