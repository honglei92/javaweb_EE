package com.doc.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doc.entity.Doc;
import com.doc.entity.User;
import com.haiersoft.db.DBOper;

public class DocDao extends DBOper{
    public List<Doc> getAllDoc(){
    	List<Doc> docList=new ArrayList<Doc>();
    	String sql="SELECT * FROM doc";
    	try{
    		ResultSet rs=this.executeQuery(sql,null);
    		while(rs.next()){
    			Doc doc=new Doc();
    			doc.setIddoc(rs.getInt("iddoc"));
    			doc.setDocname(rs.getString("dconame"));
    			doc.setDocpath(rs.getString("docpath"));
    			doc.setDocdescription(rs.getString("docdescription"));
    			doc.setBeizhu(rs.getString("beizhu"));
    			doc.setUsername(rs.getString("username"));
    			docList.add(doc);
    		}
    	}catch(SQLException e){
    		e.printStackTrace();
    	}finally{
    		this.closeAll();
    	}
    	return docList;
    }
//    根据档案名查找档案
public List<User> getUserByName(String name){
	 List<User> userList =new ArrayList<User>();
	String sql="SELECT * FROM userdetail WHERE userName LIKE '%" + name +"%'";
	try{
		ResultSet rs=this.executeQuery(sql,null);
		if(rs.next()){
			User user= new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setUserpass(rs.getString("userpass"));
			user.setRole(rs.getInt("role"));
			user.setLogtime(rs.getString("logtime"));
			userList.add(user);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		this.closeAll();
	}
	return userList;
}
//	添加新用户
	public boolean addUser(User user){
		boolean r=false;
		try{
			String sql="INSERT INTO userdetail(id,username,userpass,role,logtime)values(?,?,?,?,?)";
			int rs=this.executeUpdate(sql,new String[]{user.getId()+"",user.getUsername(),user.getUserpass(),""+user.getRole(),user.getLogtime() });
			if(rs>0){
				r=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return r;
	}
//修改用户信息
	public boolean editUser(User user){
		boolean r=false;
		try{
			String sql="UPDATE userdetail SET userpass=?,role=? WHERE username=?";
			int rs=this.executeUpdate(sql,new String[]{user.getUserpass(),""+user.getRole(),""+user.getLogtime(),""+user.getLogtime(),user.getUsername() });
			if(rs>0){
				r=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return r;
	}
//	删除指定用户
	public boolean delUserById(int id){
		boolean r=false;
		try{
			String sql="DELETE FROM userdetail WHERE id=?";
			int rs=this.executeUpdate(sql,new String[]{id+""});
			if(rs>0){
				r=true;
			}
		}catch (Exception e){
			e.printStackTrace();
	}
		return r;
}
}

