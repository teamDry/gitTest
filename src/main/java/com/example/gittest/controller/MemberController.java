package com.example.gittest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private String testString;

    public MemberController() {
        this.testString = "test";
    }

    public void chMethod() {
        testString = "test";
    }

}
