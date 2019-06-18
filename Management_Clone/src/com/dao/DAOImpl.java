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
	public boolean getEmployee(int id) {
		boolean res2 = db.readEmp(id);
		return false;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
	boolean res1 = db.updateEmp(emp);
		return res1;
	}

	@Override
	public boolean deleteEmployee(int id) {
		boolean res3 = db.deleteEmp(id);

		return res3;
		
	}
	
	

}
