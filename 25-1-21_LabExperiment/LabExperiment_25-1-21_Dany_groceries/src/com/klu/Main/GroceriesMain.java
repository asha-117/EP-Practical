package com.klu.Main;
import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.GroceriesBean;
import com.klu.groceries_operations.Groceries_insert_display;

public class GroceriesMain {
	public static void main(String args[]) throws Exception
	{
		Scanner s=new Scanner(System.in);
		GroceriesBean gb=new GroceriesBean();
		Groceries_insert_display gid=new Groceries_insert_display();
		while(true) {
		System.out.println("1.INSERTION");
		System.out.println("2.DISPLAY");
		System.out.println("3.TOTAL COST");
		System.out.println("4.EXIT");
		System.out.println("Enter choice:");
		int choice=s.nextInt();
		switch(choice) {
		  case 1:
			  System.out.println("Enter item details as itemid,itemname,itemcost");
			  int num=s.nextInt();
			  String name=s.next();
			  int cost=s.nextInt();
			  gb.setItemid(num);
			  gb.setItemname(name);
			  gb.setItemcost(cost);
			  int result_insertion=gid.GroceriesInsert(gb);
			  if(result_insertion>0)
			  {
				  System.out.println("Insertion successful");
			  }
			  else
			  {
				  System.out.println("Insertion unsuccessfull");
			  }
		    break;
		  case 2:
			  gid.GroceriesDisplay();
			  break;
		  case 3:
			  int total=gid.TotalCost();
			  if(total>0)
			  {
				  System.out.println("Total cost is displayed");
			  }
			  else
			  {
				  System.out.println("Total cost cannot be displayed");
			  } 
			  break;
		  case 4:
			  System.out.println("Thank you");
			  System.exit(0);
		  default:
		    System.out.println(" Please enter a valid choice");
		}
		}
	}
}
