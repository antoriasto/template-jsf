package inc.john.template.jsf.service;

import inc.john.template.jsf.model.Employee;

public interface EmployeeService {
	Employee save(Employee employee);
	Employee delete(Employee employee);
	Employee findById(Long id);
}
