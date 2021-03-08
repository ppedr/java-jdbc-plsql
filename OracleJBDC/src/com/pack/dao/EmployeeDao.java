package com.pack.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.pack.bean.Employee;
import com.pack.util.DBConnection;

public class EmployeeDao {
	
	public void createTable() {
		
		Connection con = DBConnection.getConnection();
		
		try {
			Statement stmt = con.createStatement();
			
			String sql = "CREATE TABLE MYEMPLOYEE("
					+ "ID NUMBER, NAME VARCHAR2(20), DEPT VARCHAR2(20),"
					+ "SAL NUMBER, PRIMARY KEY(ID))";
			
			stmt.execute(sql);
			
			System.out.println("Table CREATE successfully!");
			
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void insertData(Employee emp) {
		
		Connection con = DBConnection.getConnection();
		
		int id = emp.getEid();
		
		String name = emp.getEname();
		
		String dept = emp.getEdept();
		
		int sal = emp.getEsal();
		
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO MYEMPLOYEE VALUES (?, ?, ?, ?)");
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setInt(4, sal);
			
			ps.execute();
			
			System.out.println("Data INSERTED successfully!");
			
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void removeData(int empId) {
		
		Connection con = DBConnection.getConnection();
		
		
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM MYEMPLOYEE WHERE ID = ?");
			
			ps.setInt(1, empId);
			
			ps.execute();
			
			System.out.println("Data INSERTED successfully!");
			
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void showData() {
			
			Connection con = DBConnection.getConnection();
			
			try {
				PreparedStatement ps = con.prepareStatement("SELECT * FROM MYEMPLOYEE");
				
				ResultSet res = ps.executeQuery();
				
				while(res.next()) {
					System.out.println(res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3));
				}
				
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
	}
	
	
	public void getFunc() {
		
		Connection con = DBConnection.getConnection();
		
		
		try {
			CallableStatement cstmt = con.prepareCall("{? = call GETSAL()}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.executeUpdate();
			int tot= cstmt.getInt(1);
			
			System.out.print("Total is "+ tot);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
