package com.service;

import com.dao.DAO;

import com.dao.DAOImpl;
import com.dto.Employee;
import com.repository.DataBase;

public class ServiceImpl implements ServiceDAo {
	DataBase db = new DataBase();
	@Override
	public boolean createEmployee(Employee emp) {
	
		boolean res = db.addEmp(emp);
		return res;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return db.getEmployee(id);
		
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		boolean res1 = db.updateEmp(emp);

		return res1;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
	return db.deleteEmployee(id);
		
	}

}
