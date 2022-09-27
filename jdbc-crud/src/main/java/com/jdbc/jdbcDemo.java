package com.jdbc;
import java.sql.*;

public class jdbcDemo
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		int id=4;
		String name="guy";
		int salary=3000;
		String dept="CS";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/axis";
		String user="root";
		String pass="12345";
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		int x=st.executeUpdate("insert into employee values('"+id+"','"+name+"','"+salary+"','"+dept+"')");
		if (x>0)
		{
			System.out.println("Insert successfull");
		}
		else
		{
			System.out.println("Insert failed");
		}
		/*while(rs.next())
		{
			rs.getInt("id");
			System.out.println(rs.getLong("id") + "  " + rs.getString("name") + "  " + rs.getLong("salary") + "  " + rs.getString("dept"));
		}
		*/
	}
}
