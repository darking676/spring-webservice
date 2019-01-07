package com.example.webservice.web;

import com.example.webservice.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsRepository postsRepository;

    @GetMapping("/")
    public  String main(Model model){
        model.addAttribute("posts",postsRepository.findAllDesc());
        return "main";
    }
}

