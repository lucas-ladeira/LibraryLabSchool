package br.com.futurodev.LibraryLabSchool.service;

import br.com.futurodev.LibraryLabSchool.model.Loan;
import br.com.futurodev.LibraryLabSchool.repository.LoanRepository;
import br.com.futurodev.LibraryLabSchool.service.interfaces.LoanService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LoanServiceImplementation implements LoanService {
    @Autowired
    private LoanRepository loanRepository;
    @Override
    public Loan save(Loan _loan) {
        return this.loanRepository.save(_loan);
    }

    @Override
    public Loan search(Long _id) {
        Optional<Loan> loanTarget = this.loanRepository.findById(_id);
        if(loanTarget.isEmpty())
            throw new EntityNotFoundException("Registro de empréstimo não encontrado.");
        return loanTarget.get();
    }

    @Override
    public Loan search(Loan _id) {
        return null;
    }

    @Override
    public List<Loan> LoansList() {
        return this.loanRepository.findAll();
    }

    @Override
    public Loan refresh(Loan _loan) {
        Loan loanTarget = search(_loan.getId());
        if(Objects.nonNull(_loan)) {
            BeanUtils.copyProperties(_loan, loanTarget, "id");
            this.loanRepository.save(loanTarget);
        }
        return null;
    }

    @Override
    public void delete(Long _id) {
        this.loanRepository.deleteById(_id);
    }
}
