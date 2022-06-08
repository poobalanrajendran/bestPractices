package com.chainsys.bestPractices.clone;

public class TestCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student firststudent=new Student();
firststudent.name="elon musk";
firststudent.age=30;
System.out.println(firststudent.hashCode());

try {
	Student secondstudent=(Student)firststudent.clone();
	System.out.println(secondstudent.name);
	System.out.println(secondstudent.age);
	System.out.println(secondstudent.hashCode());
} catch (CloneNotSupportedException e) {
	
	e.printStackTrace();
}
	}

}
