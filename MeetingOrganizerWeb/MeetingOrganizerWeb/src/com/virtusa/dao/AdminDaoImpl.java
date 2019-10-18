package com.virtusa.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.virtusa.entities.Admin;
import com.virtusa.entities.Rooms;
import com.virtusa.integrate.ConnectionManager;

public class AdminDaoImpl implements AdminDAO {

	 public int add(Rooms room){
	        int status=0;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingorg","root","system");
	            PreparedStatement ps=con.prepareStatement("insert into rooms(floor_no,room_no,room_type,capacity) values(?,?,?,?)");
	            ps.setInt(1,room.getFloorNo());
	            ps.setInt(2,room.getRoomNo());
	            ps.setString(3,room.getRoomType());
	            ps.setInt(4,room.getRoomCapacity());
	            status=ps.executeUpdate();
	            con.close();
	            
	        }catch(Exception e){System.out.println(e);}
	        
	        return status;
	    }
	    public int update(Rooms room){
	        int status=0;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingorg","root","system");
	            PreparedStatement ps=con.prepareStatement("update rooms set floor_no=?,room_no=?,room_type=?,capacity=? where room_no=?");
	            ps.setInt(1,room.getFloorNo());
	            ps.setInt(2,room.getRoomNo());
	            ps.setString(3,room.getRoomType());
	            ps.setInt(4,room.getRoomCapacity());
	            status=ps.executeUpdate();
	            con.close();
	            
	        }catch(Exception e){System.out.println(e);}
	        
	        return status;
	    }
	    public List<Rooms> viewAllInfo(){
	        List<Rooms> list=new ArrayList<Rooms>();
	        try{
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingorg","root","system");
	            PreparedStatement ps= con.prepareStatement("select * from rooms");
	            ResultSet rs=ps.executeQuery();
	            while(rs.next()){
	                Rooms room=new Rooms();
	                room.setFloorNo(rs.getInt("floorNo"));
	                room.setRoomNo(rs.getInt("roomNo"));
	                room.setRoomType(rs.getString("roomType"));
	                room.setRoomCapacity(rs.getInt("capacity "));
	            
	                list.add(room);
	            }
	            con.close();
	            
	        }catch(Exception e){System.out.println(e);}
	        
	        return list;
	    }
	    
	    public int delete(int room_no){
	        int status=0;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingorg","root","system");
	            PreparedStatement ps=con.prepareStatement("delete from rooms where room_no=?");
	            ps.setInt(1,room_no);
	            status=ps.executeUpdate();
	            con.close();
	            
	        }catch(Exception e){System.out.println(e);}
	        
	        return status;
	    }

	 

	    public boolean authenticate(String userName,String password){
	        boolean status=false;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingorg","root","system");
	            PreparedStatement ps=con.prepareStatement("select * from admin where userName=? and password=?");
	            ps.setString(1,userName);
	            ps.setString(2,password);
	            ResultSet rs=ps.executeQuery();
	            if(rs.next()){
	                status=true;
	            }
	            con.close();
	            
	        }catch(Exception e){System.out.println(e);}
	        
	        return status;
	    }
	
}
