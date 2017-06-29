package com.lab;

public class LibraryApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library library1 = new Library("Daniel Boone Regional Library");
		Branch booneCounty = new Branch("Boone County");
		Customer customer1 = new Customer("123 Hope Place", "Joelle", 1234);
		Book book1 = new Book(false, "King", 1234554321, "Pet Cemetery", 001);
		Book book2 = new Book(false, "Tolkein", 1234444321, "The Hobbit", 002);
		
		booneCounty.addBook(book1);
		booneCounty.addBook(book2);
		
		customer1.checkOutBook(book1, booneCounty);
		customer1.checkOutBook(book2, booneCounty);
		
		System.out.println(booneCounty.bookCount());
		
		for(Book b : customer1.booksOut){
			System.out.println(b.toString());
		}
		
		System.out.println(customer1.booksOut.toString());
		System.out.println(booneCounty.bookCount());
		
		Branch pulaskiCounty = new Branch("Pulaski County");
		library1.transferBook(book1, booneCounty, pulaskiCounty);
		
	}
}
