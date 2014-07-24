package inc.john.template.jsf.controller;

import java.io.Serializable;

import inc.john.template.jsf.model.Employee;

import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController implements Serializable {
	private static final long serialVersionUID = -8548698719260700903L;
	
	private Employee employee = new Employee(1L, "John");

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
