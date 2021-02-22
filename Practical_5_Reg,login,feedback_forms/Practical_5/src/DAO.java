import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DAO {
	public int Insert1(Bean rb)throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBConnection();
		String sql1="insert  into register values(?,?,?)";
		
		PreparedStatement ps1=con.prepareStatement(sql1); 
		
		ps1.setInt(1, rb.getRegno());
		ps1.setString(2, rb.getName());
		ps1.setString(3, rb.getEmail());
		
		int i=ps1.executeUpdate(); 
		
		con.close();  
		return i;
		
	}
	public int Insert2(Bean rb)throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBConnection();
		
		String sql2="insert  into login values(?)";
		
		
		PreparedStatement ps2=con.prepareStatement(sql2);
		
		ps2.setString(1, rb.getEmail());
		
		int i=ps2.executeUpdate(); 
		
		con.close();  
		return i;
		
	}
	public int Insert3(Bean rb)throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBConnection();
		
		String sql3="insert  into feed values(?,?,?)";
		
		PreparedStatement ps3=con.prepareStatement(sql3); 
		
		ps3.setString(1, rb.getName());
		ps3.setString(2, rb.getEmail());
		ps3.setString(3, rb.getComments());
		int i=ps3.executeUpdate(); 
		
		con.close();  
		return i;
		
	}
	
	}

