package com.example.homework.repo;

import com.example.homework.entity.AverageBalance;
import com.example.homework.entity.PeriodAccount;
import com.example.homework.entity.UserAccount;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.time.Period;
import java.util.List;

@Mapper
public interface AccountBalanceRepo{

    List<UserAccount> getUserAccountList(String userId);
    List<AverageBalance> getAverageBalanceList();
    int getTotAmt(int year);
    List<PeriodAccount> getPeriodAccountList(String stDt, String endt);
}
