package AssignmentOnAbstraction;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("TestTool is Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Selenium using Java");
	}
	
	public static void main(String[] args) {
		Automation object = new Automation();
		object.java();
		object.Selenium();
		object.ruby();
	}


	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby is Override");
	}

}
