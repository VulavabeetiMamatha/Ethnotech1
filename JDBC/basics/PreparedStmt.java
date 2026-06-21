package JDBC.basics;

import java.sql.*;


public class PreparedStmt {
    private static final String url="jdbc:mysql://localhost:3306/jdbc";
    private static final String userName="root";
    private static final String password="Mammu@18";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//Load the driver
        Connection con = DriverManager.getConnection(url, userName, password);
        /*String query="select * from students";
        java.sql.PreparedStatement ps=con.prepareStatement(query);
        ResultSet res=ps.executeQuery();//trying to get data from table
        while(res.next())
        {
            int id=res.getInt("id");//same column name will be use
            String name=res.getString("name");
            String email=res.getString("email");
            int marks=res.getInt("marks");
            System.out.println(id+" "+name+" "+email+" "+marks);
        }
        */
        String query = "insert into students(name,id) values(?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "Ram");
        ps.setInt(2, 23);

        int rowsAffected = ps.executeUpdate();

        System.out.println(rowsAffected + " row inserted successfully");

        ps.close();
        con.close();
    }

}
