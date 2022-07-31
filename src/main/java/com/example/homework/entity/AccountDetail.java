package com.example.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(AccountDetailPK.class)
@Table(name = "account_detail")
public class AccountDetail implements Serializable{
    @Id
    @Column(nullable = false, unique = true, length = 100)
    private String account_id;

    @Column
    private String pay_cd;

    @Column
    private int pay_amt;

    @Column
    private Date pay_date;


}
