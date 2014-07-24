package inc.john.template.jsf.controller;

import java.io.Serializable;

import inc.john.template.jsf.model.Employee;
import inc.john.template.jsf.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController implements Serializable {
	private static final long serialVersionUID = -8548698719260700903L;
	
	@Autowired
	EmployeeService employeeService;
	
	private Employee employee = new Employee(1L, "John");
	private Employee employee2 = new Employee();
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee2() {
		Employee em;
		try {
			em = employeeService.findById(1L);
			if (em != null) {
				employee2 = em;
				return employee2;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Employee(2L, "Lily");
	}

	public void setEmployee2(Employee employee2) {
		this.employee2 = employee2;
	}
}
