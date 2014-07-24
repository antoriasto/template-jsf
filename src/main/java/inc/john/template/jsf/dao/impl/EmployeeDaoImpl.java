package inc.john.template.jsf.dao.impl;

import org.springframework.stereotype.Repository;

import inc.john.template.jsf.dao.EmployeeDao;
import inc.john.template.jsf.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends BaseDaoHibernate<Employee> implements EmployeeDao{

	@Override
	public Employee save(Employee employee) {
		return saveBase(employee);
	}

	@Override
	public Employee delete(Employee employee) {
		return deleteBase(employee);
	}

	@Override
	public Employee findById(Long id) {
		return findByIdBase(id);
	}

}
