package inc.john.template.jsf.dao;

import java.util.List;

import inc.john.template.jsf.model.Employee;

public interface EmployeeDao {
	Employee save(Employee employee);
	Employee delete(Employee employee);
	Employee findById(Long id);
	List<Employee> findAllData();
}
