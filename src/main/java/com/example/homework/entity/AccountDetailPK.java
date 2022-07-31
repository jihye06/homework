package com.example.homework.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AccountDetailPK implements Serializable {
    private String account_id;
    private String pay_cd;
    private int pay_amt;
    private Date pay_date;
}
