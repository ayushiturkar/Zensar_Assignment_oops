
public class Account {
	long accountNo;
	String customerName ;
	
	Account(){
		accountNo = 35788952;
		customerName = "Kamal";
		System.out.println(+accountNo  +customerName);
		System.out.println("I am in default constructor.");
	}
	
	Account(long accountNo , String customerName)
	{
		this.accountNo = accountNo;
		this.customerName= customerName;
		System.out.println(+accountNo  +customerName);
		System.out.println("I am in parameterized constructor ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account acc = new Account(47679, "Kamal");
	}

}
