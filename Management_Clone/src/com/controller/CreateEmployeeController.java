package com.controller;
import java.util.Scanner;

import com.dto.Employee;
import com.service.ServiceDAo;
import com.service.ServiceImpl;

public class CreateEmployeeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter emp id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter salary");
		double sal = sc.nextDouble();
		System.out.println("Enter password");
		String pass = sc.next();
		
	
		emp.setId(id);
		emp.setName(name);
		emp.setPassword(pass);
		emp.setSalary(sal);
		
		ServiceDAo service =  new ServiceImpl();
		boolean res = service.createEmployee(emp);
		if(res)
		{
			System.out.println("Employee Successfully Added");
		}
		else
		{
			System.out.println("Somethimg went wrong");
			
		}
		

		
		ServiceDAo service1 =  new ServiceImpl();
		boolean res1 = service1.createEmployee(emp);
		System.out.println("Enter the ID which You want to Update that Data");
		int id2 = sc.nextInt();
		if(id ==id2)
		{
		System.out.println("Enter The new NAme");
		String name1 = sc.next();
		System.out.println("Enter the new salary");
		double sal1 = sc.nextDouble();
		System.out.println("Enter the new password");
		String pass1= sc.next();
		
		emp.setName(name1);
		emp.setPassword(pass1);
		emp.setSalary(sal1);
		if(res1)
		{
			System.out.println("Successfully Updated");
		}
		else
		{
			System.out.println("Not Updated");
		}
		}
		else
		{
			System.out.println("Incorrected ID");
			System.exit(0);
		}
		
		ServiceDAo service2 =  new ServiceImpl();
		boolean res2 = service1.createEmployee(emp);	
		System.out.println("Enter the Id to View Data");
		int id3= sc.nextInt();
		if(id2 ==id3)
		{
		System.out.println(emp);
		}
		else
		{
			System.out.println("Incorrected ID");
			System.exit(0);
		}
		ServiceDAo service3 =  new ServiceImpl();
		boolean res3 = service1.createEmployee(emp);	
		
		System.out.println("Enter the ID to Delete data");
		int id4 = sc.nextInt();
		if(id3 == id4)
		{
		if(res3==true)
		{
			System.out.println("Successfully Deleted");
		}
		else
		{
			System.out.println("Something went Wrong");
		}
		}
		else
		{
			System.out.println("Incorrected ID");
		}
		try
		{
		if(id !=(Integer) null)
		{
			System.out.println(emp);
		}
		}
		catch(Exception e)
		{
			System.out.println("Database is Empty");
		}
		
	
	
		
		
		
	}
}
