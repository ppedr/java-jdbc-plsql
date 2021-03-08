package com.pack.main;

import com.pack.bean.Employee;
import com.pack.dao.EmployeeDao;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome user!");
		
		EmployeeDao edao = new EmployeeDao();
		
//		edao.createTable();
		
//		edao.insertData(new Employee(13, "Tst", "CSI", 0));
		
//		edao.removeData(13);
		
//		edao.showData();
		
//		edao.getFunc();
		
		edao.getNameS(12);
		


	}

}


//CREATE OR REPLACE PROCEDURE updatesal (emp_id NUMBER, outstaticip OUT VARCHAR2) IS
//Varr myemployee.name%Type;
//BEGIN
//select name
//into Varr
//from myemployee
//where ID = emp_id;
//
//if Varr <> 'Pedro' then
//outstaticip:= Varr;
//else
//outstaticip:= 'nok';
//end if;
//END updatesal;
