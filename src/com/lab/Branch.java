package com.lab;

import java.util.ArrayList;

public class Branch {
	String region;
	public ArrayList<Book> availableBookInventory = new ArrayList<Book>();
	public ArrayList<Book> checkedOutBookInventory = new ArrayList<Book>();
	
	public String toString(){
		return region;
	}
	
	//Parameterized constructor
	public Branch(String region){
		this.region = region;
	}
	
	//method to add a book to available inventory
	public void addBook(Book b1){
		this.availableBookInventory.add(b1);
		this.checkedOutBookInventory.remove(b1);
		b1.setBranch(this);
	}
	
	//method to remove a book from available inventory
	public void removeBook(Book b1){
		this.availableBookInventory.remove(b1);
		this.checkedOutBookInventory.add(b1);
		b1.setBranch(null);
	}
	
	//need a method to count how many books there are
	public int bookCount(){
		return availableBookInventory.size() + checkedOutBookInventory.size();
	}
	
}
