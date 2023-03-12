package student;

public class StudentInfo {
	public int getStudentInfo(int id) {
		id=320;
		System.out.println("Student Id is"+id);
		return id;
	}
	public int getStudentInfo(int id, String Name) {
		id=320;
		Name="Keerthi";
		System.out.println("Student Id is " +id);
		System.out.println("StudentName is " +Name);
		return id;
	}
	public void getStudentInfo(String EmailId, String PhoneNo) {
		EmailId="keerthishanmugam@gmail.com";
		PhoneNo="210320991";
		System.out.println("Email id: " +EmailId);
		System.out.println("Phone Number: " +PhoneNo);
	}
	public static void main(String[] args) {
		StudentInfo info=new StudentInfo();
		info.getStudentInfo(320);
		info.getStudentInfo(320, "Keerthi");
		info.getStudentInfo(null, null);
	}
}
