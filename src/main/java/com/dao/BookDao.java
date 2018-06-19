package com.dao;

import com.model.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBooksById(int id);
    public List<Book> listBooks();
    Book getBooks(String search);
    public void readBook(boolean isUpdate, Book book);
}
