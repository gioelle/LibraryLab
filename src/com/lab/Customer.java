package com.lab;

import java.util.ArrayList;

public class Customer {
	
	private String address;
	private String name;
	private long memberNumber;
	
	//Customer has a list of checked out books on this ArrayList
	ArrayList<Book> booksOut = new ArrayList<Book>();
	
	//Default constructor 
	public Customer(){}
	
	//Parameterized constructor
	public Customer(String address, String name, long memberNumber){
		this.address = address;
		this.name = name; 
		this.memberNumber = memberNumber;
	}
	
	//Method to check out a book in the customer's name. Toggles a book's availability
	public void checkOutBook(Book b1, Branch b2){
		if(b2.availableBookInventory.contains(b1)){
			booksOut.add(b1);
			b1.setCheckedOut(true);
			System.out.println("Book succesfully checked out");
			b2.availableBookInventory.remove(b1);
			b2.checkedOutBookInventory.add(b1);
		}
		else {
			System.out.println("Book is unavailable, please keep browsing");
		}
	}
	
	//Method to return the book to the library. Toggles a books' availability. 
	//adds book to available array and removes it from checked out array
	public void returnbook(Book b1, Branch b2){
		booksOut.remove(b1);
		b1.setCheckedOut(false);
		b2.availableBookInventory.add(b1);
		b2.checkedOutBookInventory.remove(b1);
		System.out.println("Book successfully returned");
	}
	
	
	//Getters & setters (Address, name, & member number of the customer
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(long memberNumber) {
		this.memberNumber = memberNumber;
	}
	

}
