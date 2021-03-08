package com.pack.bean;

public class Employee {
	
	private int eid;
	private String ename;
	private String edept;
	private int esal;
	
	public Employee(int eid, String ename, String edept, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.esal = esal;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getEdept() {
		return edept;
	}
	
	public void setEdept(String edept) {
		this.edept = edept;
	}
	
	public int getEsal() {
		return esal;
	}
	
	public void setEsal(int esal) {
		this.esal = esal;
	}
	
}