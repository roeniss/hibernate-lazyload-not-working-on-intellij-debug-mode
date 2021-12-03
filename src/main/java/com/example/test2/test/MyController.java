package com.example.test2.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@ResponseBody
public class MyController {
    private final MyService myService;

    @GetMapping
    public String test() {
        return myService.getPost().name;
    }
}
