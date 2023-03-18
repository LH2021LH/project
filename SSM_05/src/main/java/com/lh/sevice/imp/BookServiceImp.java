package com.lh.sevice.imp;

import com.lh.dao.BookMapper;
import com.lh.pojo.Book;
import com.lh.sevice.BookService;

import java.util.List;

public class BookServiceImp implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> queryAllBooks() {

        return bookMapper.queryAllBooks();
    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insertBook(book);
    }

    @Override
    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    @Override
    public int updateBookById(Book book) {
        return bookMapper.updateBookById(book);
    }

    @Override
    public Book queryBookById(int bookID) {
        return bookMapper.queryBookById(bookID);
    }

    @Override
    public List<Book> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
