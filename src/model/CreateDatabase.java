package model;

import java.sql.*;

public class CreateDatabase {
	Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/curriculum_design;create=true" ; 
    private static String user = "root";     //mysql登录名
    private static String pass = "";     //mysql登录密码
    CreateDatabase(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");     //加载mysql数据库驱动
    	}catch(Exception e){}
    	 try{
  	       con=DriverManager.getConnection(url,user,pass);   //连接数据库
  	   }catch(Exception e){}
    	 try {
 	        Statement statement = con.createStatement();
 	        String SQL="create table curridesign"+"(id char(20) primary key,password varchar(30), birth date)";
 	        statement.executeUpdate(SQL);       //执行sql语句创建表
 	        con.close();
 	   }
 	   catch(SQLException e) {}          //如果表已经存在，将触发SQL异常，即不再创建该表
 	   
    }
    
}
