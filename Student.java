package admissionProgram;

public class Student {
	private String sname;
	private int sid;
	private int std;
	
	Student(String sname, int sid, int std){
		this(sname,sid);
		this.std=std;
	}
	Student(String sname,int sid){
		this(sname);
		this.sid=sid;
	}
	Student(String sname){
		this.sname=sname;
	}
	
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std=std;
	}
}
