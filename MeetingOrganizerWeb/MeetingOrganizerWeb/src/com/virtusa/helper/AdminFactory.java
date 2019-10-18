package com.virtusa.helper;

import com.virtusa.dao.AdminDAO;
import com.virtusa.dao.AdminDaoImpl;
import com.virtusa.service.AdminService;

public class AdminFactory {
		// TODO Auto-generated method stub
	public static AdminDAO createAdminDAO() {
		AdminDAO adminDAO=new AdminDaoImpl();
		return adminDAO;
	}
	public static AdminService createAdminService() {
		AdminService adminService=new AdminService();
		return adminService;
	}
	}


