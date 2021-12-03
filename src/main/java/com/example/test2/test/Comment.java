package com.example.test2.test;

import lombok.Data;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    Long id;

    @Column
    String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;
}
