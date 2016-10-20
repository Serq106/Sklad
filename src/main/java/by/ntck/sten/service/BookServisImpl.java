package by.ntck.sten.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ntck.sten.interfaces.BookDao;
import by.ntck.sten.interfaces.BookService;
import by.ntck.sten.model.Book;

@Service
@Transactional
public class BookServisImpl implements BookService {
	private BookDao dao;

	public void setDao(BookDao bookDao) {
		this.dao = bookDao;

	}

	@Override
	public void addBook(Book book) {
		this.dao.addBook(book);

	}

	@Override
	public void updateBook(Book book) {
		this.dao.updateBook(book);
	}

	@Override
	public void removeBook(int id) {
		this.removeBook(id);
	}

	@Override
	public Book getBookById(int id) {
		return this.dao.getBookById(id);
	}

	@Override
	public List<Book> listBooks() {

		return this.dao.listBooks();
	}

}
