package com.bookstore.service;

public class BookServiceImpl implements BookService {


	// declare instance variable
	String jdbcURL ;
	String jdbcUsername ;
	String jdbcPassword ;
	
	// intialize valuee through Constructor

	public BookServiceImpl(String jdbcURL , String jdbcUsername, String jdbcPassword) {
		
		this.jdbcURL =jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	private BookDao  bookDao = new BookDAOImpl();

	//------ato
	
	@Override
	public void insertBook(Book book) throws SQLException {
		
		System.out.println("BookServiceImpl :"+book.getTitle() +" "+ book.getAuthor()+ " "+ book.getPrice());

		bookDao.insertBook(book);
	}	
	

}
