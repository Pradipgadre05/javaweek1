package com.greatlearning.assignment;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName()
	{
		return "tech Department";
	}
	public String work()
	{
		return "complete module of coding 1";
	}
	public String techStackInfo()
	{
		return "core java";
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
