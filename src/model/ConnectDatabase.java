package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
	Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/curriculum_design";
    private static String user = "root";          //mysql登录名
    private static String pass = "";          //mysql登录密码
	public final void connectDatabase() {
	    try{
	        con=DriverManager.getConnection(url,user,pass);//连接数据库代码
	       }
	       catch(Exception e){}
	   }
}
