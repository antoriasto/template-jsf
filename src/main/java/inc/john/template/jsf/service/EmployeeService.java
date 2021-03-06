package inc.john.template.jsf.service;

import java.util.List;

import inc.john.template.jsf.model.Employee;

public interface EmployeeService {
	Employee save(Employee employee) throws Exception;
	Employee delete(Employee employee) throws Exception;
	Employee findById(Long id) throws Exception;
	List<Employee> findAllData() throws Exception;
}
