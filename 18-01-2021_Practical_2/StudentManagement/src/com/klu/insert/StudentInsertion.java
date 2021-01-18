package com.klu.insert;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;

public class StudentInsertion {
public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException
{
	Connection con=DBUtil.DBConnection();
	PreparedStatement st1=con.prepareStatement("insert into Student values()");  
	st1.setInt(1,student.getRegno());
	st1.setString(1,student.getName());
	st1.setString(1,student.getEmail());
	int i=st1.executeUpdate();    
	con.close();  
	return i;
}
}
