package com.lab;

import java.util.ArrayList;

public class Library {
//	private CustomerProfile[];
	
	//library has a branch list & a member list, both are arrayLists.
	public String libraryName;
	ArrayList<Branch> branchList = new ArrayList<Branch>();
	ArrayList<Customer> memberList = new ArrayList<Customer>();
	
	//library constructor
	public Library (String libraryName){
		this.libraryName = libraryName;
	}
	
	//method to add a new branch
	public void addBranch(Branch br1){
		branchList.add(br1);
	}
	//method to add a new customer
	public void addCustomer(Customer c1){
		memberList.add(c1);
	}
	//method to transfer a book from one branch to another
	public void transferBook(Book b1, Branch branch1, Branch branch2){
		branch1.removeBook(b1);
		branch2.addBook(b1);
		System.out.println("Book Successfully Transferred.");
	}	
	//toString method to help print
	public String toString(){
		return libraryName;
	}
	

	//getters & setters (library name variable)
	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}


}
