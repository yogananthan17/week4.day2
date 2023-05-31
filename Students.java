package week4.day2;

public class Students {
	
	public void getStudentInfo(int ID){
		System.out.println("Student ID: "+ ID);
		
		
	}
	public void getStudentInfo(String name) {
		System.out.println("Student Name: "+ name);
	}
	public void getStudentInfo(String email,String instituteName) {
		System.out.println("Student email: "+ email);
		System.out.println("Student institutename: "+instituteName);
	}
	public void getStudentInfo(long number) {
		System.out.println("Student Mobile Number: "+number);
	}
	

	public static void main(String[] args) {
		Students studentInfo = new Students();
		studentInfo.getStudentInfo(123);
		studentInfo.getStudentInfo("Yogananthan");
		studentInfo.getStudentInfo("yoga@gmail.com", "Testleaf");
		studentInfo.getStudentInfo(8778664535L);
		
		

	}

}
