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
	public boolean getEmployee(int id) {
		// TODO Auto-generated method stub
		boolean res2 = db.readEmp(id);
		
		return res2 ;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		boolean res1 = db.updateEmp(emp);

		return res1;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean res3 =db.deleteEmp(id);
		return false;
	}

}
