package com.example.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
public class User {

    @Id
    @Column(nullable = false, unique = true, length = 30)
    private String user_id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column
    private int age;

    @Column
    private Date input_date;
}
