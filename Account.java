

public class Account {
	
// 	Solde du compte
	private double balance;
	
// 	Le rélevé du compte
	private Statement statement;
	
// 	le solde minimal qu'on peut avoir sur un compte
	private double minBalance;
	
//  le solde maximal qu'on peut avoir sur un compte
	private double maxBalance;
	
/*	Les constructeurs	*/
	
	public Account(){
		statement=new Statement();
		balance=0;
		
		//  les montants limites du compte sont définits arbitrairement.
		
		this.maxBalance=2000;
		this.minBalance=-200;
	}
	public Account(double balance,double minBalance, double maxBalance){
		this();
		this.balance=balance;
		this.maxBalance=maxBalance;
		this.minBalance=minBalance;
	}
	
// 		Pour faire un retrait
	
	public void withdrawal(double amount){
		
		// teste si le retrait est autorisé
		if((balance-amount)>= minBalance){
			Operation operation=new Operation("WITHDRAWAL",amount);
			statement.addOperation(operation);
			balance-=amount;
			System.out.println("Operation reussie");
		}
		else
			System.out.println("impossible de retirer");
	}
	
//	 	 Pour faire un depôt
	
	public void deposit(double amount){
		
//		 test si le dépôt est autorisé 
		
		if((balance+amount)<= maxBalance){
			Operation operation=new Operation("DEPOSIT   ",amount);
			statement.addOperation(operation);
			balance+=amount;
			System.out.println("Operation reussie");
		}
		else{
			System.out.println("impossible de déposer");
		}
	}
	
// 		Pour afficher le releve du compte.
	
	public void  print(){
		System.out.println("Voici votre releve: ");
		System.out.println("-------=======---------");	
		System.out.println("OPERATION    MONTANT    DATE ");
		System.out.println("----------------------------");	
		System.out.println(statement.print());
		System.out.println("SOLDE:   "+balance);
		System.out.println("ABIENTOT");
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	 
}
