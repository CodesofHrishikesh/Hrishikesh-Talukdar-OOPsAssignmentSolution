package com.services.Admin;

import com.services.Super.Super_Department;

public class Admin_Department extends Super_Department{

	public Admin_Department() {
		super();
		
	}
	@Override
	public String departmentName()
	{
	   return "Admin Department";
	}
	@Override

	public String getTodayswork()
	{
	   return "Complete your documents submission";
	}
	
	@Override
	public String getworkdeadline()
	{
	   return "Complete by EOD";
	}

}

