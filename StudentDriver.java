package admissionProgram;
import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		School s1=new School();
		boolean exit=true;
		while(exit) {
		System.out.println("CHOOSE OPTION: \n1.ADD STUDENT\n2.REMOVE STUDENT\n3.UPDATE STUDENT STANDARD\n4.DISPLAY STUDENT DATA\n5.EXIT");
		int choice=sc.nextInt();
		switch(choice) {
			
		case 1:{
			s1.addStudent();
		}
		break;
		case 2:{
			s1.removeStudent();
		}
		break;
		case 3:{
			s1.updateDetails();
		}
		break;
		case 4:{
			s1.displayStudent();
		}
		break;
		case 5:{
			exit=false;
		}
		default:{
			System.out.println("INVALID CHOICE");
		}
		}
		}
	}
}
