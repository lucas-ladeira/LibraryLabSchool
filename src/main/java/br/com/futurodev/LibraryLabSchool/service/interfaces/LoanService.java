package br.com.futurodev.LibraryLabSchool.service.interfaces;

import br.com.futurodev.LibraryLabSchool.model.Loan;

import java.util.List;

public interface LoanService {
    Loan save(Loan _loan);
    Loan search(Loan _id);

    Loan search(Long _id);

    List<Loan> LoansList();
    Loan refresh(Loan _loan);
    void delete(Long _id);
}
