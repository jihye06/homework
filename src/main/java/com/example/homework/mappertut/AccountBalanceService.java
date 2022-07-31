package com.example.homework.mappertut;

import com.example.homework.entity.AverageBalance;
import com.example.homework.entity.PeriodAccount;
import com.example.homework.entity.UserAccount;
import com.example.homework.repo.AccountBalanceRepo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountBalanceService {
    AccountBalanceRepo accountBalanceRepo;

    public AccountBalanceService(AccountBalanceRepo accountBalanceRepo){
        this.accountBalanceRepo = accountBalanceRepo;
    }

    public List<UserAccount> getUserAccountList(String userId){
        return accountBalanceRepo.getUserAccountList(userId);
    }

    public List<AverageBalance> getAverageBalanceList(){
        return accountBalanceRepo.getAverageBalanceList();
    }

    public int getTotAmt(int year){
        return accountBalanceRepo.getTotAmt(year);
    }

    public List<PeriodAccount> getPeriodAccountList(String stDt, String endt){
        return accountBalanceRepo.getPeriodAccountList(stDt, endt);
    }


}
