package com.haiersoft.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOper {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public Connection getConn(String server,String dbname,String user,String pwd)
	throws ClassNotFoundException,SQLException,InstantiationException,IllegalAccessException{
		String DRIVER ="com.mysql.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/doc?user=root&password=123456";
		Class.forName(DRIVER).newInstance();
		conn=DriverManager.getConnection(URL);
		return conn;
	}
    public void closeAll(){
    	if(rs!=null){
    		try{
    			rs.close();
    		}catch (SQLException e){
    			e.printStackTrace();
    		}
    	}
    	if(pstmt!=null){
    		try{
    			pstmt.close();
    		}catch(SQLException e){
    			e.printStackTrace();
    		}
    	}
    	
    	if(conn!=null){
    		try{
    			conn.close();
    		}catch(SQLException e){
    			e.printStackTrace();
    		}
    	}
    }
    
    public ResultSet executeQuery(String preparedSql,String[] param){
    	try{
    		pstmt=conn.prepareStatement(preparedSql);
    		if(param!=null){
    			for(int i=0;i<param.length;i++){
    				pstmt.setString(i+1, param[i]);
    			}
    		}
    		rs=pstmt.executeQuery();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return rs;
    }
    
    public int executeUpdate(String prepareaSql,String[] param){
    	int num=0;
    	try{
    		pstmt=conn.prepareStatement(prepareaSql);
    		if(param!=null){
    			for(int i=0;i<param.length;i++){
    				pstmt.setString(i+1, param[i]);
    			}
    		}
    		num=pstmt.executeUpdate();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return num;
    }
}
