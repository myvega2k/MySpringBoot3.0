package com.basic.myspringboot.controller;

import com.basic.myspringboot.dto.UserResDTO;
import com.basic.myspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/userspage")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/first")
    public String leaf(Model model) {
        model.addAttribute("name","스프링부트");
        return "leaf";
    }

    @GetMapping("/index")
    public ModelAndView index() {
        List<UserResDTO> userResDTOList = userService.getUsers();
        return new ModelAndView("index","users",userResDTOList);
    }

}
