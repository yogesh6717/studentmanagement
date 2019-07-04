package com.dao;
import com.dto.*;

public interface DAO {
	public boolean createEmployee(Employee emp);
	
	public Employee getEmployee(int id);
	
	public boolean updateEmployee(Employee emp);
	
	public boolean deleteEmployee(int id);

}
