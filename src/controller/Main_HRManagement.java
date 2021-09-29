package controller;

import java.util.Scanner;

import com.dao.employee_implement;
import com.dao.employee_interface;

import model.employee;

public class Main_HRManagement {

	private static int dob;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		employee_interface emp = new employee_implement();
		do {
			int choice = 0;
			System.out.println("1. add employee");
			System.out.println("2. delete employee");
			System.out.println("3. update details of employee");
			System.out.println("4. search employee by name,id,department");

			System.out.println("Enter your choice");
			choice = scn.nextInt();
			switch (choice) {
			case 1:
				System.out.println("add Employee_id");
				int eid = scn.nextInt();
				System.out.println("Enter Employee Name");
				String name = scn.next();
				System.out.println("Enter Adress");
				String add = scn.next();
				System.out.println("Enter City");
				String city = scn.next();
				System.out.println("Enter Date of Birth");
				String bid = scn.next();
				System.out.println("Enter Department ID");
				int deptID = scn.nextInt();
				employee e = new employee(eid, name, eid, add, city, bid);
				
				emp.add_employee(e);
				break;
			case 2:
				System.out.println("Enter ID of employee to delete");
				int eid1  =     scn.nextInt();
				if(emp.deleteEmployee(eid1)) {
					System.out.println("Employee Deleted");
				}else {
					System.out.println("Can't Delete Employee");
				}
				break;
			case 3:
				System.out.println("Enter ID of employee to update");
				int eid2 = scn.nextInt();
				System.out.println("1. Name");
                System.out.println("2. Department ID");
                System.out.println("3. Address ");
                System.out.println("4. ");
				if(emp.updateEmployee(eid2)) {
					System.out.println("Employee updated");
				}else {
					System.out.println("can't update employee");
					
				}
				break;
			case 4:
				System.out.println("Enter ID of employee to searched");
				String name1 = scn.next();
				break;
			}
		} while (flag);

	}

}
