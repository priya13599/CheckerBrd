package com.nucleus.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.nucleus.entity.Customer;

public interface ICustomerDao {
	
	public void SaveCustomerDetails(Customer customer) throws SQLException;
	public void DeleteCustomerDetails(Customer customer) throws SQLException;
	public Customer updatecustomerDetails(String customercode) throws SQLException;
	public void updatecustomerDetails1(Customer customer) throws SQLException;
	public ArrayList DisplayCustomerDetails() throws SQLException;
	public Customer DispalyCustomerDetailsByCode(String customercode) throws SQLException;
	public ArrayList SortAscendingCustomerDetails() throws SQLException;
	public ArrayList SortDescendingCustomerDetails() throws SQLException;
	public ArrayList CheckPrimaryKey() throws SQLException;
	public ArrayList DisplayNewCustomerDetails() throws SQLException;
	public void SaveCustomerDetailsMST(Customer customer) throws SQLException;
	public Customer GetDataFromTemporaryTable(String customercode) throws SQLException;
    public void SaveRejectedCustomerDetails(Customer customer)throws SQLException;
    public ArrayList DisplayModifiedCustomerDetails() throws SQLException;
    public void ModifiedRejectedCustomerDetails(Customer customer)throws SQLException;
}
