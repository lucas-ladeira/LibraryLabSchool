package br.com.futurodev.LibraryLabSchool.controller;

import br.com.futurodev.LibraryLabSchool.model.Author;
import br.com.futurodev.LibraryLabSchool.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<Author> save(@RequestBody Author _author) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.authorService.save(_author));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> search(@PathVariable Long _id) {
        return ResponseEntity.ok(this.authorService.search(_id));
    }

    public ResponseEntity<List<Author>> authorsList() {
        return ResponseEntity.ok(this.authorService.authorsList());
    }

    @PutMapping
    public ResponseEntity<Author> refresh(@RequestBody Author _author) {
        return ResponseEntity.ok(this.authorService.refresh(_author));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long _id) {
        this.authorService.delete(_id);
        return ResponseEntity.ok().build();
    }
}
