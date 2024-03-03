package com.example.project1.user;

import lombok.RequiredArgsConstructor;
import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/join")
    public String join(UserRequest.JoinDTO requestDTO){
        System.out.println(requestDTO);

        userRepository.save(requestDTO);
        return "redirect:/loginForm";
    }

    @PostMapping("/login")
    public String login(){
        return "redirect:/loginForm";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/loginForm")  // http://localhost:8080 바로 뒤에 띄어쓰지 않고 따옴표 안에 있는 -> /loginForm 요놈을 쳐야해
    public String loginForm(){
        return "/user/loginForm";
    } // 여기로 가고 싶으면

    @GetMapping("/joinForm")
    public String joinForm(){
        return "/user/joinForm";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    @GetMapping("/myPage")
    public String myPage(){
        return "myPage/main";
    }

    @GetMapping("/myPage/selectList")
    public String myPageList(){
        return "myPage/selectList";
    }
}
