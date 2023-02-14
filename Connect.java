import java.sql.*;
public class Connect
{
	public Connection con;
	public Connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// jdbc=api, oracle=database, thin=driver, vaibhav-godse=system name,1521 is port number, xe = oracle service
			String url="jdbc:oracle:thin:@VAIBHAV-GODSE:1521:xe";
			
			//DriverManager is class having getConnection is method
			//system = username, oracle = password
			Connection con= DriverManager.getConnection(url, "system","oracle");
		}
		catch(Exception e1)
		{
			System.out.println("Connection failed: "+e1);
		}
	}
};




