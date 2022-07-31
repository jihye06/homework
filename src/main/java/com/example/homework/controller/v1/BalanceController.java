package com.example.homework.controller.v1;

import com.example.homework.entity.AccountDetail;
import com.example.homework.entity.AverageBalance;
import com.example.homework.entity.PeriodAccount;
import com.example.homework.entity.UserAccount;
import com.example.homework.mappertut.AccountBalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Controller
public class BalanceController {

    @Autowired
    AccountBalanceService accountBalanceService;

    @GetMapping("/balance/{user_id}")
    public List<UserAccount> findById(@PathVariable String userId) {
         return accountBalanceService.getUserAccountList(userId);
    }

    @GetMapping("/balance")
    public List<AverageBalance> findByAge() {
        return accountBalanceService.getAverageBalanceList();
    }

    @GetMapping("/balance/{year}")
    public int findTotAmt(@PathVariable int year) {
        return accountBalanceService.getTotAmt(year);
    }

    @GetMapping("/balance/{stDt}&&{endt}")
    public List<PeriodAccount> findUser(@PathVariable String stDt, String endt) {
        return accountBalanceService.getPeriodAccountList(stDt, endt);
    }
}

