package com.neyaz.ExpenseTracker.Repository;



import com.neyaz.ExpenseTracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}