package br.com.futurodev.LibraryLabSchool.controller;

import br.com.futurodev.LibraryLabSchool.model.Loan;
import br.com.futurodev.LibraryLabSchool.service.interfaces.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<Loan> save(@RequestBody Loan _loan) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.loanService.save(_loan));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> search(@PathVariable Loan _id) {
        return ResponseEntity.ok(this.loanService.search(_id));
    }

    @GetMapping
    public ResponseEntity<List<Loan>> LoansList() {
        return ResponseEntity.ok(this.loanService.LoansList());
    }

    @PutMapping
    public ResponseEntity<Loan> refresh(@RequestBody Loan _loan) {
        return ResponseEntity.ok(this.loanService.refresh(_loan));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long _id) {
        this.loanService.delete(_id);
        return ResponseEntity.ok().build();
    }
}
