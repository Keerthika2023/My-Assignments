package week1.day1;

 public class mobileAssignent2{
	 
 public void makeCall() {
	 
		String mobileModel;
		float mobileWeight;
		mobileModel="Samsung";
		mobileWeight=9.2f;
		System.out.println("Mobile Model is "+mobileModel);
		System.out.println("Mobile Weight is "+mobileWeight);
	}
	public void sendMsg() {
		boolean fullCharged;
		int mobileCost;
		fullCharged=true;
		mobileCost=50000;
		System.out.println("Mobile FullCharged is "+ fullCharged);
		System.out.println("Mobile Cost is "+ mobileCost);
		}
public static void main(String[] args) {
	mobileAssignent2 mob = new mobileAssignent2();
	mob.makeCall();
	mob.sendMsg();
}
}
