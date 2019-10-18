package com.virtusa.controller;

import com.virtusa.helper.AdminFactory;
import com.virtusa.model.AdminModel;
import com.virtusa.service.AdminService;

public class AdminController {

		private AdminService adminService;
		
		public AdminController() {
			this.adminService=AdminFactory.createAdminService();
		}
			public void adminAuthentication(String userName,String password) {
				
				AdminModel adminModel=new AdminModel();
				adminModel.setUserName(userName);
				adminModel.setPassword(password);
			      if(adminModel.getUserName().equals(userName))	{
			    	  
			      }
		  
		
	}

}
