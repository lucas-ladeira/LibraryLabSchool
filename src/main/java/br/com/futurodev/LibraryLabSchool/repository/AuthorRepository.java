package br.com.futurodev.LibraryLabSchool.repository;

import br.com.futurodev.LibraryLabSchool.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
