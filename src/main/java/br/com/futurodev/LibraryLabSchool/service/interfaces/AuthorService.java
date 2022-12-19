package br.com.futurodev.LibraryLabSchool.service.interfaces;

import br.com.futurodev.LibraryLabSchool.model.Author;

import java.util.List;

public interface AuthorService {
    Author save(Author _author);
    Author search(Long _id);
    List<Author> authorsList();
    Author refresh(Author _author);
    void delete(Long _id);
}
