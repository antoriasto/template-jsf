package inc.john.template.jsf.service.impl;

import inc.john.template.jsf.dao.EmployeeDao;
import inc.john.template.jsf.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Employee delete(Employee employee) {
		return employeeDao.save(employee);
	}

	public Employee findById(Employee employee) {
		return employeeDao.save(employee);
	}
	
}
