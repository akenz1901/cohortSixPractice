public class AirConditionerTest{

	public static void main(String... args){

		AirConditioner productName = new AirConditioner();
		
		productName.prepareProductName("Yamaha");

		String newProduct = productName.provideProductName();
		
		System.out.printf("The product name is %s%n ", newProduct);

	}

}