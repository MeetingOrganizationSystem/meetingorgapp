package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Rooms;

public interface AdminDAO {

	 public int add(Rooms room);
	 public int update(Rooms room);
	 public List<Rooms> viewAllInfo();
	 public int delete(int room_no);
	 public boolean authenticate(String userName,String password);
}
