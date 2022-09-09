package admissionProgram;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class School {
	Student s;
	
	Scanner sc=new Scanner(System.in);
	
	ArrayList<Student> arr=new ArrayList<Student>();
	
	public void addStudent()  {
		boolean choice=true;
		while(choice) {
		System.out.println("ENTER NAME OF STUDENT: ");
		String name=sc.next();
		System.out.println("ENTER STANDARD OF STUDENT: ");
		int std=sc.nextInt();
		System.out.println("ENTER ID OF STUDENT: ");
		int id=sc.nextInt();
		for(Student o:arr) {
			if(o.getSid()==id) {
				while(choice) {
					System.out.println("THIS ID ALREADY PRESENT PLEASE ENTER DIFFERENT ID: ");
					int a=sc.nextInt();
					if(id==a) {
						choice=true;
					}
					else {
						id=a;
						choice=false;
					}
					
				}
			}
		}
		s= new Student(name,id,std);
		this.s=s;
		arr.add(s);
		System.out.println("ADMISSION SUCCESSFUL....");
		System.out.println("--------------------------------");
		
		System.out.println("DO YOU WANT TO ADD ANOTHER DATA Y/N");
		char ch=sc.next().charAt(0);
		if(ch=='y' || ch=='Y') {
			choice=true;
		}
		else if(ch=='n' || ch=='N') {
			choice=false;
		}
		else {
			System.out.println("INVALID CHOICE: ");
			choice=false;
		}
		
		}
	}
	
	public void removeStudent(){
		if(this.s==null) {
			System.out.println("NO RECORD FOUND");
		}
		else {
			System.out.println("ENTER ID: ");
			int id=sc.nextInt();
			for(Student o:arr) {
				if(o.getSid()==id) {
					arr.remove(o);
					System.out.println("STUDENT RECORD DELETED SUCCESSFULLY......");
					System.out.println("--------------------------------");
					System.out.println();
				}
				else {
					System.out.println("ID NOT MATCHED!");
					System.out.println();
				}
			}
		}
	}
	
	public void updateDetails() {
		if(this.s==null) {
			System.out.println("NO RECORD FOUND");
		}
		else {
			System.out.println("ENTER ID: ");
			int id=sc.nextInt();
			for(Student o:arr) {
				if(o.getSid()==id) {
					System.out.println("ENTER NEW STANDARD OF STUDENT: ");
					int std=sc.nextInt();
					o.setStd(std);
					System.out.println("--------------------------------");
					System.out.println();
				}
				else {
					System.out.println("ID NOT MATCHED!");
					System.out.println();
				}
			}
		}
	}

	public void displayStudent() {
		if(this.s==null) {
			System.out.println("NO RECORD FOUND");
		}
		else {
			System.out.println("ENTER ID: ");
			int id=sc.nextInt();
			for(Student o:arr) {
				if(o.getSid()==id) {
					System.out.println(o.getSname());
					System.out.println(o.getSid());
					System.out.println(o.getStd());
					System.out.println("--------------------------------");
					System.out.println();
					
				}
				else {
					System.out.println("ID NOT MATCHED!");
					System.out.println();
				}
			}
		}
	}	
}
