package bean;  
import java.sql.*;  
public class LoginDAO {  
  
public static boolean validate(LoginBean bean){  
boolean status=false;  
try{  
Connection con=ConnectionProvider.getCon();  
              
PreparedStatement ps=con.prepareStatement(  
    "select * from login where Name=? and Password=?");  
System.out.println("##########################  bean.getUsername() ################ " + bean.getUsername());
System.out.println("##########################  bean.getPass() ################ " + bean.getPassword());

ps.setString(1,bean.getUsername());  
ps.setString(2, bean.getPassword());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next();  
System.out.println("##########################  status ################ " + status);
              
}catch(Exception e){
	e.printStackTrace();
}  
  
return status;  
  
}  
} 