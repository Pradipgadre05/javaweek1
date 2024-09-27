package com.greatlearning.assignment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName()
	{
		return "admin department";
	}
	public String work()
	{
		return "complete your document submission";
	}
	public String workDeadline()
	{
		return "completed by EOD";
	}
	public String holiday()
	{
		return super.holiday();
	}

}
