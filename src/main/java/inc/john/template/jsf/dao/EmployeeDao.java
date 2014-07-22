package inc.john.template.jsf.dao;

import inc.john.template.jsf.model.Employee;

public interface EmployeeDao {
	Employee save(Employee employee);
	Employee delete(Employee employee);
	Employee findById(Employee employee);
}
