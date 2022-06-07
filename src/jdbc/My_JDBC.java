package jdbc;

import java.sql.*;
public class My_JDBC {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Deepika@5799");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from food_lovers");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
