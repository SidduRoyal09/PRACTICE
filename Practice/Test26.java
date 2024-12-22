package com.Practice;

class Faculity implements Cloneable{
	String fname;
	String fUsername;
	String fEmail;
	String fpassword;
	public Faculity(String fname,String fUsername,String fEmail,String fpassword){
		this.fname=fname;
		this.fUsername=fname;
		this.fEmail=fEmail;
		this.fpassword=fpassword;
		
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Admin implements Cloneable{
	String aname;
	String aUsername;
	String aEmail;
	String apassword;
	public Admin(String aname, String aUsername, String aEmail, String apassword) {
		this.aname = aname;
		this.aUsername = aUsername;
		this.aEmail = aEmail;
		this.apassword = apassword;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Student24 implements Cloneable{
	String sname;
	String sUsername;
	String sEmail;
	String spassword;
	public Student24(String sname, String sUsername, String sEmail, String spassword) {
		this.sname = sname;
		this.sUsername = sUsername;
		this.sEmail = sEmail;
		this.spassword = spassword;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
class User implements Cloneable{
	Faculity fob;
	Admin aob;
	Student24 sob;
	public User(Faculity fob, Admin aob, Student24 sob) {
		this.fob = fob;
		this.aob = aob;
		this.sob = sob;
	}
	
	public Object clone() throws CloneNotSupportedException{
		User u2=(User)super.clone();
		u2.fob=(Faculity)fob.clone(); 
		u2.sob=(Student24)sob.clone();
		u2.aob=(Admin)aob.clone();
		return u2; 
	}  
	
	
}
public class Test26 {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Faculity fob=new Faculity("s","r","1@3","11");
		Student24 sob=new Student24("r","s","1@2","24");
		Admin aob=new Admin("p","v","1@4","1124"); 
		User u=new User(fob,aob,sob);
		User u1=(User)u.clone();
		System.out.println(u1.fob.fname);
		System.out.println(u1.aob.aname);
		System.out.println(u1.sob.sname);
	} 

}
