package robledo.junior.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import robledo.junior.picpaysimplificado.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
