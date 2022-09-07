package enhancements;
import java.sql.*;

public class BatchUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","tiger");
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into test1 values(11,'lilil',45)");
			stmt.addBatch("delete from test1 where sno=4");
			stmt.addBatch("update test1 set marks=90 where sno=5");
			stmt.executeBatch();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
