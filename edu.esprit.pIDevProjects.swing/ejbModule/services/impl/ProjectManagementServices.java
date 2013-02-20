package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.ProjectManagementServicesLocal;
import services.interfaces.ProjectManagementServicesRemote;
import entities.Employee;

/**
 * Session Bean implementation class ProjectManagementServices
 */
@Stateless
public class ProjectManagementServices implements
		ProjectManagementServicesRemote, ProjectManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProjectManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
		System.out.println("ok");

	}

}
