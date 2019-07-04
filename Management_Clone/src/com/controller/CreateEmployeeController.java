package com.controller;
import java.util.Scanner;

import com.dto.Employee;
import com.repository.DataBase;
import com.service.ServiceDAo;
import com.service.ServiceImpl;

public class CreateEmployeeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp;
		DataBase d=new DataBase();
		ServiceDAo service =  new ServiceImpl();


		String b;
		do
		{
			System.out.println("1 . Insert the Data of Employee");
			System.out.println("2 . Update the Data of Employee");
			System.out.println("3 . View Details of Employee");
			System.out.println("4 . Delete the Data of Employee");
			System.out.println("5 . Get All Employee Details");
		
			System.out.println("Enter number to perform Operations :");
			int n = sc.nextInt();

			switch (n)
			{

			case 1:
				System.out.println("Enter emp id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter salary");
				double sal = sc.nextDouble();
				System.out.println("Enter password");
				String pass = sc.next();

				emp=new Employee();
				emp.setId(id);
				emp.setName(name);
				emp.setPassword(pass);
				emp.setSalary(sal);


				boolean res = service.createEmployee(emp);
				if(res)
				{
					System.out.println("Employee Successfully Added");
				}
				else
				{
					System.out.println("Somethimg went wrong");

				}
				break;



			case 2:
			
				System.out.println("Enter the ID which You want to Update that Data");
				int id2 = sc.nextInt();

				System.out.println("Enter The new NAme");
				String name1 = sc.next();
				System.out.println("Enter the new salary");
				double sal1 = sc.nextDouble();
				System.out.println("Enter the new password");
				String pass1= sc.next();

				emp=new Employee();

				emp.setName(name1);
				emp.setPassword(pass1);
				emp.setSalary(sal1);
				emp.setId(id2);
				boolean up=service.updateEmployee(emp);
				if(up)
				{
					System.out.println("Successfully Updated");
				}
				else
				{
					System.err.println("Employee with id "+id2+" does not exists");
				}
				break;

			case 3:

				System.out.println("Enter the Id to View Data");
				int id3= sc.nextInt();
			
				Employee em = service.getEmployee(id3);
				if(em!=null)
				{
					System.out.println(em);
				}
				else
				{
					System.err.println("ID doesnt Exist");
					System.exit(0);
				}
				break;
			case 4:

				System.out.println("Enter the ID to Delete data");
				int id4 = sc.nextInt();
				boolean res3 = service.deleteEmployee(id4);	

				if(res3)
				{
					System.out.println("Successfully Deleted");
				}
				else
				{
					System.err.println("User Doesn't Exist");
				}

				break;
			case 5:
				d.getAllEmploee();
				break;

			default :
				System.out.println("Incoreect Number");
				break;


			}

			System.out.println("Do u want to continue(y/n)???");

			b = sc.next();
		}while(b.equals("y"));










	}
}
