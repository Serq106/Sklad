package by.ntck.sten.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.ntck.sten.interfaces.BookDao;
import by.ntck.sten.interfaces.BookService;
import by.ntck.sten.model.Book;

@Transactional
public class BookServisImpl implements BookService {
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void addBook(Book book) {
		this.bookDao.addBook(book);

	}

	@Override
	public void updateBook(Book book) {
		this.bookDao.updateBook(book);
	}

	@Override
	public void removeBook(int id) {
		this.removeBook(id);
	}

	@Override
	public Book getBookById(int id) {
		return this.bookDao.getBookById(id);
	}

	@Override
	public List<Book> listBooks() {

		return this.bookDao.listBooks();
	}

}
