package METHODS;

class Bank{
	void form() {
		System.out.println("details--->");
	}
	void proof(int id,String name,String aadhar) {
		System.out.println("id :"+id+" name :"+name+" aadhar no :"+aadhar);
	}
	String passbook() {
		return "passbook";
	}
	String deposit(int amount) {
		System.out.println("amount given is "+amount);
		return "deposited";
	}
}
public class Store {

	public static void main(String[] args) {
	    Bank obj = new Bank();
	    obj.form();
	    obj.proof(364876, "vijay", "273894567016" );
	    System.out.println("Bank give to "+obj.passbook());
	    System.out.println("amount is "+obj.deposit(500));

	    
	}

}
