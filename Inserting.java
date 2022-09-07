package enhancements;
import java.sql.*;


public class Inserting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","tiger");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select sno,name,marks from test1");
			rs.moveToInsertRow();
			rs.updateInt(1, 8);
			rs.updateString(2, "kkk");
			rs.updateInt(3, 99);
			rs.insertRow();
			System.out.println("One Record Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
