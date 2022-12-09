package br.com.futurodev.LibraryLabSchool.service;

import br.com.futurodev.LibraryLabSchool.model.Author;
import br.com.futurodev.LibraryLabSchool.repository.AuthorRepository;
import br.com.futurodev.LibraryLabSchool.service.interfaces.AuthorService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AuthorServiceImplementation implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author save(Author _author) {
        return this.authorRepository.save(_author);
    }

    @Override
    public Author search(Long _id) {
        Optional<Author> authorTarget = this.authorRepository.findById(_id);
        if(authorTarget.isEmpty())
            throw new EntityNotFoundException("Autor não encontrado.");
        return authorTarget.get();
    }

    @Override
    public List<Author> authorsList() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author refresh(Author _author) {
        Author authorTarget = search(_author.getId());
        if(Objects.nonNull(_author)) {
            BeanUtils.copyProperties(_author, authorTarget, "id");
            this.authorRepository.save(authorTarget);
        }
        return null;
    }

    @Override
    public void delete(Long _id) {
        this.authorRepository.deleteById(_id);
    }
}
