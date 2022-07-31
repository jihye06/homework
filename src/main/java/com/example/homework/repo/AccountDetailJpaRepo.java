package com.example.homework.repo;

import com.example.homework.entity.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDetailJpaRepo extends JpaRepository<AccountDetail, Long> {
}
