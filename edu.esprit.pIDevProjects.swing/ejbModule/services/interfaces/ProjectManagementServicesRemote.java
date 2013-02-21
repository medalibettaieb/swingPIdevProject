package services.interfaces;

import javax.ejb.Remote;

import entities.Employee;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProjectManagementServicesRemote.
 */
@Remote
public interface ProjectManagementServicesRemote {

	/**
	 * Adds the employee.
	 * 
	 * @param employee
	 *            the employee
	 */
	void addEmployee(Employee employee);

}
