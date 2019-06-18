package com.repository;

import java.util.*;

import com.dto.Employee;

public class DataBase {
	Map<Integer,Employee> map = new HashMap<>();

	public boolean addEmp(Employee emp)
	{
		
		map.put(emp.getId(),emp);
        
		
		if(emp!=null)
		{
			return true;
		}
		return false;		
   
	}

	public boolean deleteEmp(int id) {
		map.remove(id);
		if(id == (Integer) null )
		{
			return true;
		}
		return false;
	}

	public boolean readEmp(int id) {
		map.get(id);
		if(id == (Integer) null )
		{
			return true;
		}
		return false;
		
	}

	public boolean updateEmp(Employee emp) {
	map.replace(emp.getId(),emp);
		if(emp!=null)
	{
			return true;
	}
	return false;
	}

}
