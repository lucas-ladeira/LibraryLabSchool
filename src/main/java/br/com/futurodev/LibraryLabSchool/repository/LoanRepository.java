package br.com.futurodev.LibraryLabSchool.repository;

import br.com.futurodev.LibraryLabSchool.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
