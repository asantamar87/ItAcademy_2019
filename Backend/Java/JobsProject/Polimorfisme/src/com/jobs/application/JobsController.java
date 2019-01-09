package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	//private EmployeeRepository repository;
	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Employee manager = new Employee (name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		 for (AbsStaffMember employee : repository.getAllMembers()) {
	            employee.pay();
	}
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		 String employees = "\n";
	        for (AbsStaffMember employee : repository.getAllMembers()) {
	           employees += employee.getName()+":" + " Salary ->" + employee.getTotalPaid() + "\n";
	        }
	return employees;
		
	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		// TODO Auto-generated method stub
		Volunteer volunteer = new Volunteer(name,address,phone,description);
		repository.addMember(volunteer);
	}
	
	
	
}
