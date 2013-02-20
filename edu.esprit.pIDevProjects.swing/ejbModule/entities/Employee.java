package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Employee
 * 
 */
@Entity
public class Employee implements Serializable {

	private int idEmployee;
	private String nameEmployee;

	
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}

	@Id
	public int getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return this.nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	
}
