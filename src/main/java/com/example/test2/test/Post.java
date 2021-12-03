package com.example.test2.test;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Post {
    @Id
    @GeneratedValue
    Long id;

    @Column
    String name;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    List<Comment> comments;
}
