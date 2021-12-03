package com.example.test2.test;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.LinkedList;

@RequiredArgsConstructor
@Service
public class MyService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;

    @Transactional
    public void setup() {
        Post p = new Post();
        p.name = "post_A";
        postRepository.save(p);

        User u = new User();
        u.name = "user_K";
        userRepository.save(u);

        Comment c = new Comment();
        c.text = "comment_Z";
        c.post = p;
        c.user = u;
        p.comments = new LinkedList<>();
        p.comments.add(c);
        u.comments = new LinkedList<>();
        u.comments.add(c);
        commentRepository.save(c);
    }

    @Transactional
    public Post getPost() {
        System.out.println("START---------------------------------");
        Post p = postRepository.findAll().get(0);
        System.out.println("NAME________________________________________" + p.name); // Putting breakpoint on this line changes results :(
        System.out.println("COMMENTS________________________________________" +  p.comments);
        return p;
    }
}
