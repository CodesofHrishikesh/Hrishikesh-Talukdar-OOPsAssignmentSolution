package com.services.Tech;

import com.services.Super.Super_Department;

public class Tech_Department extends Super_Department{

	public Tech_Department() {
		super();
	
	} 
	@Override
	public String departmentName()
	{
	   return "Tech Department";
	}
	@Override

	public String getTodayswork()
	{
	   return "Complete coding of module 1";
	}
	
	@Override
	public String getworkdeadline()
	{
	   return "Complete by EOD";
	}
	public String getTechStackInformation()
	{
	   return "Core java";
	}

}
