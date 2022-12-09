package br.com.futurodev.LibraryLabSchool.service;

import br.com.futurodev.LibraryLabSchool.model.Book;
import br.com.futurodev.LibraryLabSchool.repository.BookRepository;
import br.com.futurodev.LibraryLabSchool.service.interfaces.BookService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookServiceImplementation implements BookService {
    @Autowired
    public BookRepository bookRepository;
    @Override
    public Book save(Book _book) {
        return this.bookRepository.save(_book);
    }

    @Override
    public List<Book> booksList() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book search(Long _id) {
        Optional<Book> bookTarget = this.bookRepository.findById(_id);
        if(bookTarget.isEmpty())
            throw new EntityNotFoundException("Livro não encontrado.");
        return bookTarget.get();
    }

    @Override
    public Book refresh(Book _book) {
        Book bookTarget = search(_book.getId());
        if(Objects.nonNull(_book)) {
            BeanUtils.copyProperties(_book, bookTarget, "id");
            this.bookRepository.save(bookTarget);
        }
        return null;
    }

    @Override
    public void delete(Long _id) {
        this.bookRepository.deleteById(_id);
    }
}
