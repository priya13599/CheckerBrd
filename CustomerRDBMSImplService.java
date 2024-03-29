package com.nucleus.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.nucleus.entity.Customer;

public class CustomerRDBMSImplService implements ICustomerService{
ICustomerDao customerdao = UserDaoFactory.getCustomerDao();
	@Override
	public void SaveCustomerDetails(Customer customer) throws SQLException {
		
		customerdao.SaveCustomerDetails(customer);
	}

	@Override
	public void DeleteCustomerDetails(Customer customer) throws SQLException {
		customerdao.DeleteCustomerDetails(customer);
		
	}

	@Override
	public Customer updatecustomerDetails(String customercode) throws SQLException {
		Customer customer = customerdao.updatecustomerDetails(customercode);
		return customer;
	}

	@Override
	public void updatecustomerDetails1(Customer customer) throws SQLException {
		customerdao.updatecustomerDetails1(customer);
		
	}

	@Override
	public ArrayList DisplayCustomerDetails() throws SQLException {
		ArrayList<Customer> arraylist =customerdao.DisplayCustomerDetails();
		return  arraylist;
	}

	@Override
	public Customer DispalyCustomerDetailsByCode(String customercode) throws SQLException {
		Customer customer = customerdao.DispalyCustomerDetailsByCode(customercode);
		return customer;
	}

	@Override
	public ArrayList SortAscendingCustomerDetails() throws SQLException {
		ArrayList<Customer> arraylist = customerdao.SortAscendingCustomerDetails();
		return arraylist;
	}

	@Override
	public ArrayList SortDescendingCustomerDetails() throws SQLException {
		ArrayList<Customer> arraylist = customerdao.SortDescendingCustomerDetails();
		return arraylist;
	}

	@Override
	public ArrayList CheckPrimaryKey() throws SQLException {
		ArrayList<Customer> arraylist = customerdao.CheckPrimaryKey();
		return arraylist;
	}

	@Override
	public void SaveCustomerDetailsMST(Customer customer) throws SQLException {
		
		customerdao.SaveCustomerDetailsMST(customer);
	}

	@Override
	public Customer GetDataFromTemporaryTable(String customercode) throws SQLException {
		Customer customer = customerdao.GetDataFromTemporaryTable(customercode);
		return customer;
	}

	@Override
	public void SaveRejectedCustomerDetails(Customer customer) throws SQLException {
		customerdao.SaveRejectedCustomerDetails(customer);
		
	}

	@Override
	public ArrayList DisplayNewCustomerDetails() throws SQLException {
		ArrayList<Customer> customerlist = customerdao.DisplayNewCustomerDetails();
		return customerlist;
	}

	@Override
	public ArrayList DisplayModifiedCustomerDetails() throws SQLException {
		ArrayList<Customer> customerlist = customerdao.DisplayModifiedCustomerDetails();
		return customerlist;
	}

	@Override
	public void ModifiedRejectedCustomerDetails(Customer customer) throws SQLException {
		customerdao.ModifiedRejectedCustomerDetails(customer);
	}

}
