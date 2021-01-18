package com.klu.Main;

import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;

public class StudentMain {
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	StudentBean sb=new StudentBean();
	sb.setRegno(101);
	sb.setName("SARA");
	sb.setEmail("sara123@gmail.com");
	StudentInsertion si=new StudentInsertion();
	int result=si.StudentInsert(sb);
	if(result>0)
	{
		System.out.println("insertion successfull");
		
	}
	else {
		System.out.println("insertion  fail");
	}
}
}
