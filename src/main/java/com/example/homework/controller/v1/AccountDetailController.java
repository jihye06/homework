
package com.example.homework.controller.v1;

import com.example.homework.entity.AccountDetail;
import com.example.homework.entity.User;
import com.example.homework.repo.AccountDetailJpaRepo;
import com.example.homework.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class AccountDetailController {
    private final AccountDetailJpaRepo accountDetailJpaRepo;

    @GetMapping(value = "/accDetail")
    public List<AccountDetail> findAllDetail() {
        return accountDetailJpaRepo.findAll();
    }

    @PostMapping(value = "/accDetail")
    public AccountDetail save() {
        AccountDetail accountDetail = AccountDetail.builder()
                .account_id("1000-01")
                .pay_cd("Y")
                .pay_amt(61400)
                //.pay_date(DateFormat.getDateInstance(20190222,yyyy-mm-dd))
                .build();

        return accountDetailJpaRepo.save(accountDetail);
    }
}

