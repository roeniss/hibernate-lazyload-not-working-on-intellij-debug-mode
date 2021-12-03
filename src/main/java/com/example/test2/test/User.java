package com.example.test2.test;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    Long id;

    @Column
    String name;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    List<Comment> comments;
}

