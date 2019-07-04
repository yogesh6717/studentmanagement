package com.repository;

import java.util.*;

import com.dto.Employee;

public class DataBase {
  static HashMap<Integer,Employee> map = new HashMap<Integer,Employee>();

	public boolean addEmp(Employee emp)
	{
		Employee emp1 = map.put(emp.getId(), emp);
		emp1=map.get(emp.getId());
		
		  if(emp1==null)
		{
			return false;
		}
		  else {
		return true;	
		  }
   
	}

	public boolean deleteEmployee(int id) {
		if(map.containsKey(id))
		{
		map.remove(id);
		return true;
		}
		else
		return false;
	}

	public Employee getEmployee(int id) {
		if(map.containsKey(id))
		{
			return map.get(id);
		}
		else
			
			return null;
	
	}

	public boolean updateEmp(Employee emp) {
		if(map.containsKey(emp.getId()))
		{
			
		 map.put(emp.getId(), emp);
		return true;
	}
	else
	{
		
			    return false;	
			  }
		} 
	public void getAllEmploee() {
		boolean b=true;
	
		for(Integer id:map.keySet()) {
			System.out.println(map.get(id));
			b=false;
		}
		
		if(b)
			System.err.println("No Data Found");
	}
	}



