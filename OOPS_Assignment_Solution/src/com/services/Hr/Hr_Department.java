package com.services.Hr;

import com.services.Super.Super_Department;

public class Hr_Department extends Super_Department{

	public Hr_Department() {
		super();
		
	}
	@Override
	public String departmentName()
	{
	   return "Hr Department";
	}
	@Override

	public String getTodayswork()
	{
	   return "Fill today's worksheet and mark your attendance";
	}
	
	@Override
	public String getworkdeadline()
	{
	   return "Complete by EOD";
	}
    
	public String doActivity()
	{
	   return "Team Lunch";
	}

}
