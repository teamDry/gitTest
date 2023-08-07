package com.example.gittest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private String testString;



    public void chMethod() {
        testString = "test";
    }

    public MemberController() {
        this.testString = "test";
    }
}
