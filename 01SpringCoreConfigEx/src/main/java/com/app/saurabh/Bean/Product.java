package com.app.saurabh.Bean;

public class Product {
	private int Pid;
	private String Pname;
	public Product() {
		super();
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + "]";
	}
	

}
