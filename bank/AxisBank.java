package bank;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Amount is Deposited");
	}
		
		public static void main(String[] args) {
		AxisBank object =new AxisBank();
		BankInfo object1=new BankInfo();
		object.deposit();
		object.fixed();
		object.saving();
		object1.deposit();

	}}
