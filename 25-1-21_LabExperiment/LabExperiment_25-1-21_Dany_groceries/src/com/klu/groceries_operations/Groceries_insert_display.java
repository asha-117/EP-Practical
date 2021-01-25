package com.klu.groceries_operations;
import java.sql.*;
import java.util.Scanner;


import com.klu.Bean.GroceriesBean;
import com.klu.Connections.DBUtil;

public class Groceries_insert_display {
	static Scanner s=new Scanner(System.in);
	public int GroceriesInsert(GroceriesBean gb) throws ClassNotFoundException, SQLException
	{
		System.out.println("Groceries are added into the list");
		Connection con=DBUtil.DBConnection();
		PreparedStatement st1=con.prepareStatement("insert into Groceries values(?,?,?)");  
		st1.setInt(1,gb.getItemid());
		st1.setString(2,gb.getItemname());
		st1.setInt(3,gb.getItemcost());
		int i=st1.executeUpdate();    
		con.close();  
		return i;
	}
	public void GroceriesDisplay() throws ClassNotFoundException, SQLException
	{
		System.out.println("   GROCERIES LIST   ");
		Connection con=DBUtil.DBConnection();
		PreparedStatement st1=con.prepareStatement("Select * from Groceries");  
		ResultSet rs=st1.executeQuery();  
		System.out.println("ITEMID\t\tITEMNAME\t\tITEMCOST");	
		while(rs.next()){  
		System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));  
		}  
		
		con.close();  
	}
	public int TotalCost() throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtil.DBConnection();
		PreparedStatement st1=con.prepareStatement("Select sum(itemcost) from Groceries");  
		ResultSet rs=st1.executeQuery();  
		while(rs.next()){  
			System.out.println("Total cost of all items:- "+rs.getInt(1)+" Rupees");  
			}  
		int i=st1.executeUpdate();    
		con.close();  
		return i;
		
		
		
	}
}
