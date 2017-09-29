package bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	
	static Connection con = null;
	static {
		try {  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/study_mat","root","");  
			}catch(Exception e){ System.out.println(e);}  
    }
	
	public static Connection getCon(){  
	    return con;  
	} 

}
