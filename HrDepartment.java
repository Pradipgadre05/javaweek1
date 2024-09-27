package com.greatlearning.assignment;

public class HrDepartment extends SuperDepartment{
	public String departmentName()
	{
		return "HR Department";
	}
	public String work()
	{
		return "fill todaysworksheet and markyour attendence";
	}
	public String workDeadline()
	{
		return "completed by EOD";
	}
	public String activity()
	{
		return "team lunch";
	}
	public String holiday()
	{
		return super.holiday();
	}
}
