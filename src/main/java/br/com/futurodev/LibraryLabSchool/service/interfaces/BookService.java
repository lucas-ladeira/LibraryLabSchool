package br.com.futurodev.LibraryLabSchool.service.interfaces;

import br.com.futurodev.LibraryLabSchool.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book _book);
    Book search(Long _id);
    List<Book> booksList();
    Book refresh(Book _book);
    void delete(Long _id);
}
