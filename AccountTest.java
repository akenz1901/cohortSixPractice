public class AccountTest{

	public static void main(String... args){

		Account akenzAccount;

		akenzAccount = new Account();
		
		akenzAccount.setName("Michael");
		
		String freshName = akenzAccount.getName();
		
		System.out.printf("The account name is %s%n ", freshName);

		System.out.printf("The account name is %s%n ", akenzAccount.name);
		



}

}