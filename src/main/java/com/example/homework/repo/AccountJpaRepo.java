package com.example.homework.repo;

import com.example.homework.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepo extends JpaRepository<Account, Long> {
}
