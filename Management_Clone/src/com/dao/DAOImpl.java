package com.dao;
import com.dto.Employee;
import com.repository.DataBase;

public class DAOImpl implements DAO {
	DataBase db = new DataBase();
	@Override
	public boolean createEmployee(Employee emp) {

		boolean res = db.addEmp(emp);

		return res;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp = db.getEmployee(id);
		return emp;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
	boolean res1 = db.updateEmp(emp);
		return res1;
	}

	@Override
	public boolean deleteEmployee(int id) {
		boolean res3 = db.deleteEmployee(id);

		return res3;
		
	}
	
	

}
