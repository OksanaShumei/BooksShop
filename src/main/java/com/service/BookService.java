package com.service;

import com.model.Book;

import java.util.Collection;
import java.util.List;

public interface BookService {

    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBooksById(int id);
    public List<Book> listBooks();
    public Book getBooks(String search);
    public void readBook(boolean isUpdate, Book book);
}
