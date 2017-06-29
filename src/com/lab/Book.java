package com.lab;

public class Book {
	private boolean checkedOut;
	private String author;
	private long isbn;
	private String title;
	private int callSign;
	private Branch branch;

	//Parameterized constructor
	public Book(boolean checkedOut, String author, long isbn, String title, int callSign){
		this.checkedOut = checkedOut;
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.callSign = callSign;
	}

	//Method to help display all the details of my book when using the print function
	public String toString(){
		return title + " by " + author + ", ISBN: " + isbn + " branch: " + branch;
	}
	
	//Getters & Setters
	public boolean isCheckedOut() {
		return checkedOut;
	}


	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public long getIsbn() {
		return isbn;
	}


	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getCallSign() {
		return callSign;
	}


	public void setCallSign(int callSign) {
		this.callSign = callSign;
	}

	
	public Branch getBranch(){
		return branch;
	}
	
	public void setBranch(Branch branch){
		this.branch = branch;
	}
	
	
}
