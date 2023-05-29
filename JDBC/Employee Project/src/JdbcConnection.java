import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JdbcConnection {
    public static void main(String args[]){
    
        try{
            String url="jdbc:mysql://localhost:3306/";
            
            String user_name="root";
            String pass_word="Ahsan@7860";
            Connection cn=DriverManager.getConnection(url+db,user_name,pass_word);
            Statement stm=cn.createStatement();
            String query="create table Student_details(sidint(3),name varchar(20))";
            System.out.println("Connection Successfully");
            cn.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
