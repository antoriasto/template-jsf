package inc.john.template.jsf.service.impl;

import java.util.List;

import inc.john.template.jsf.dao.EmployeeDao;
import inc.john.template.jsf.model.Employee;
import inc.john.template.jsf.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Employee delete(Employee employee) {
		return employeeDao.delete(employee);
	}

	@Override
	public Employee findById(Long id) throws Exception {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> findAllData() throws Exception {
		return employeeDao.findAllData();
	}
	
}
