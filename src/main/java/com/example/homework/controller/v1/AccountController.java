package com.example.homework.controller.v1;

import com.example.homework.entity.Account;
import com.example.homework.repo.AccountJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Controller
public class AccountController {

    private final AccountJpaRepo accountJpaRepo;

    @GetMapping(value = "/acc")
    public List<Account> findAllAccount(){
        return accountJpaRepo.findAll();
    }

    @PostMapping(value = "/acc")
    public Account save() {
        Account acc = Account.builder()
                .user_id("1")
                .account_id("1000-22")
                .build();

        return accountJpaRepo.save(acc);
    }

}
