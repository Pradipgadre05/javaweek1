package com.greatlearning.assignment;

import java.util.Scanner;

public class Organisation {

	public static void main(String[] args) {
		System.out.println("which departments information you want to know");
		System.out.println("enter 1 for super deparment\n "
				+ "ente 2 for admin department\n "
				+ "enter 3 for hR department\n"
				+ "enter 4 for techdepartment"
				);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("  ");
			System.out.println("superdepartmet:----");
			SuperDepartment sd=new SuperDepartment();
			String departName=sd.departmentName();
			System.out.println("departname :"+departName);
			String gg=sd.work();	
			System.out.println("work :"+gg);
			String wa=sd.workDeadline();
			System.out.println("work deadline :"+wa);
			String hd=sd.holiday();
			System.out.println("holiday :"+hd);
			break;
		
		case 2:
			System.out.println("Admin Department: ----");
			AdminDepartment admin=new AdminDepartment();
			String dname=admin.departmentName();
			System.out.println("department name is : "+dname);
			String works=admin.work();	
			System.out.println("work is :"+works);
			String wactivity=admin.workDeadline();
			System.out.println("work activity :"+wactivity);
			String holidayys=admin.holiday();
			System.out.println("holidays :"+holidayys);
			break;
			
		case 3:
			System.out.println(" ");
			System.out.println("HR Dreartment:--");
			HrDepartment hr= new HrDepartment();
			String dn=hr.departmentName();
			System.out.println("department name :"+dn);
			String w=hr.work();	
			System.out.println("work :"+w);
			String waactivity=hr.workDeadline();
			System.out.println("work deadline :"+waactivity);
			String holid=hr.holiday();
			System.out.println("holiday :"+holid);
			String act=hr.activity();
			System.out.println("acyivity :"+act);
			break;
		
		
		
		case 4:
			System.out.println(" ");
			System.out.println("tech Department:-----");
			TechDepartment tm=new TechDepartment();
			String depName=tm.departmentName();
			System.out.println("department anme :"+depName);
			String wo=tm.work();
			System.out.println("work :"+wo);
			String techinfo=tm.techStackInfo();
			System.out.println("tech stack info :"+techinfo);
			String holiD=tm.holiday();
			System.out.println("holiday :"+holiD);
			String workD =tm.workDeadline();
			System.out.println("work deadline :"+workD);
			break;
			
		default :
			System.out.println("enter correct value");
		
		}
	}

}
