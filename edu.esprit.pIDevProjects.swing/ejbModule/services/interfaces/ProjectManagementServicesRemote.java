package services.interfaces;

import javax.ejb.Remote;

import entities.Employee;

@Remote
public interface ProjectManagementServicesRemote {
	void addEmployee(Employee employee);

}
