package com.example.project1.user;

import lombok.Data;

public class UserRequest {

    @Data
    public static class JoinDTO{
        private String rename;
        private String uname;
        private String pwd;
        private String email;
        private String date;
        private String address;
    }

    @Data
    private static class LoginDTO{
        private String uname;
        private String pwd;

    }
}
