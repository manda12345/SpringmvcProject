package com.springCrudOperation.Service;
import java.util.List;
import com.springCrudOperation.model.Employee;

public interface EmployeeService {
	public int save(Employee p);
	public int update(Employee p);
	public int delete(int id);
	public Employee getEmpById(int id);
	public List<Employee> getEmployees();
}
