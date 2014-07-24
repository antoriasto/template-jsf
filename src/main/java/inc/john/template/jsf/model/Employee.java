package inc.john.template.jsf.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 8355881097955899110L;

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAMA", nullable=false)
	private String name;

	public Employee() {
		super();
	}
	
	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
