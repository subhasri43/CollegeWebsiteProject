package uniq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class sign {
	public static Connection getconnection() throws SQLException{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uniq","root","subha172002");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static int save(empbean a)throws SQLException{
		int b=0;
		try {
			Connection obj=getconnection();
			PreparedStatement ps=obj.prepareStatement("insert into student4(name,password,email,phoneno) values(?,?,?,?)");
			ps.setString(1,a.getname());
			ps.setString(2, a.getpass());
			ps.setString(3, a.getmail());
			ps.setString(4, a.getphoneno());
			b=ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	//view method
	public static List<empbean> getuser(){
		List<empbean> list=new ArrayList<>();
		try {
			Connection con=sign.getconnection();
			PreparedStatement obj=con.prepareStatement("select * from student1 where name=? and pass=?");
            ResultSet rs=obj.executeQuery();
			while(((ResultSet) rs).next()){
				empbean ob=new empbean();
				ob.setname(rs.getString(1));
				ob.setpass(rs.getString(2));
				list.add(ob);
			}
		}
		catch(Exception e) {
			
		}
		return list;
		}

}
