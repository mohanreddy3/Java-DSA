package com.examples;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name="Amit";
		s.roll=212;
		System.out.println(s.toString());
		ArrayList listObj=new ArrayList();
		listObj.add(new String("Welcome"));
		listObj.add("Chennai");
		System.out.println(listObj);
		
		System.out.printf("data avl in roll %d variable", s.roll);
		
		
		
	}

}
