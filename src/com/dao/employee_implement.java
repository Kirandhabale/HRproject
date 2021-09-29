package com.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import configuration.DB_Connector;
import model.employee;

public class employee_implement implements employee_interface {

	@Override
	public void add_employee(employee e) {
		// TODO Auto-generated method stub
		
		try (Connection con = DB_Connector.connect();
				PreparedStatement preparedStatement = con.prepareStatement(
						"insert into" + " employee(emp_id,emp_name,dep_id,emp_address,city,dob)values(?,?,?,?,?,?)");) {
			preparedStatement.setInt(1, e.getEmp_id());
			preparedStatement.setString(2, e.getEmp_name());
			preparedStatement.setInt(3, e.getDep_id());
			preparedStatement.setString(4, e.getEmp_address());
			preparedStatement.setString(5, e.getCity());
			preparedStatement.setString(6, e.getDob());

			int i = preparedStatement.executeUpdate();
			if (i > 0) {
				System.out.println("Employee Added");
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

	@Override
	public boolean deleteEmployee(int eid1) {
		try(Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("delete from employee where Emp_id=?;")){
			 pst.setInt(1, eid1);
			 int i = pst.executeUpdate();
			 if(i>0) {
				 
				 return true;
			 }else {
				 return false;
			 }
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int eid2) {
		// TODO Auto-generated method stub
		
			
		
		return false;
	}


		
	}
	


	