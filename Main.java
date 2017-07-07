/**
 * 
 */

/**
 * @author cheikh haibala
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				/* USER1 */
		System.out.println("USER1");
		Account user1=new Account();
		
		// Dépot de 10 
		user1.deposit(10);
		System.out.println("votre solde: "+user1.getBalance());
		
		System.out.println();
			
			  /* USER2 */
				
		System.out.println("USER2");
		Account user2=new Account();
		
		// Dépot de 10 
		user2.withdrawal(200);
		System.out.println("votre solde: "+user2.getBalance());
		
		System.out.println();
		
		 /* USER3 */
		
		System.out.println("USER3");
		Account user3=new Account();
		
		// Retrait  de 200
		user3.withdrawal(200);
		// retrait de 20
		user3.withdrawal(20);
		// depot de 100
		user3.deposit(100);
		// retrait de 20
		user3.withdrawal(20);
		// depot de 10
		user3.deposit(10);
	
		// statement
		user3.print();

	}

}
