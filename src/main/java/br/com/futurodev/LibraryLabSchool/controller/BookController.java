package br.com.futurodev.LibraryLabSchool.controller;

import br.com.futurodev.LibraryLabSchool.model.Book;
import br.com.futurodev.LibraryLabSchool.service.interfaces.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody @Valid Book _book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookService.save(_book));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> search(@PathVariable Long _id) {
        return ResponseEntity.ok(this.bookService.search(_id));
    }

    @GetMapping
    public ResponseEntity<List<Book>> booksList() {
        return ResponseEntity.ok(this.bookService.booksList());
    }

    @PutMapping
    public ResponseEntity<Book> refresh(@RequestBody Book _book) {
        return ResponseEntity.ok(this.bookService.refresh(_book));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long _id) {
        this.bookService.delete(_id);
        return ResponseEntity.ok().build();
    }
}
