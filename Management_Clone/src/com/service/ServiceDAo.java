package com.service;

import com.dto.Employee;

public interface ServiceDAo {
	public boolean createEmployee(Employee emp);

	public boolean getEmployee(int id);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(int id);
}
