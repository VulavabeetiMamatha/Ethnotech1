package JDBC.basics;

import java.sql.*;

public class JD {
    private static final String url="jdbc:mysql://localhost:3306/jdbc";
    private static final String userName="root";
    private static final String password="Mammu@18";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//Load the driver
        Connection con= DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
        /*String query="select * from students";
        ResultSet res=st.executeQuery(query);//trying to get data from table
         while(res.next())
        {
            int id=res.getInt("id");//same column name will be use
            String name=res.getString("name");
            String email=res.getString("email");
            int marks=res.getInt("marks");
            System.out.println(id+" "+name+" "+email+" "+marks);
        }*/
//        String query1=String.format("insert into students(id,name,email,marks) values(%d,'%s','%s',%d)",3,"am","am@gmail.com",99);
//        int myres=st.executeUpdate(query1);//inserting,updating,delete
//        if(myres>0)
//            System.out.println("success");
//        else
//            System.out.println("fail");

//     String query=String.format("update students set marks=%d where id=%d",80,2);
//     int res=st.executeUpdate(query);
//        if(res>0)
//            System.out.println("success");
//        else
//            System.out.println("fail");
        String query=String.format("delete from students where id =%d",3);
        int res=st.executeUpdate(query);
        if(res>0)
            System.out.println("success");
        else
           System.out.println("fail");
    }
}
