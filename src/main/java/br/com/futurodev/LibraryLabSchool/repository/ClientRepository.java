package br.com.futurodev.LibraryLabSchool.repository;

import br.com.futurodev.LibraryLabSchool.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
