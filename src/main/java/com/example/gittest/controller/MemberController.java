package com.example.gittest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private String testString;

<<<<<<< HEAD
    public MemberController() {
        this.testString = "test";
    }

    public String testMethod() {
        return "test/testing";
=======


    public void chMethod() {
        testString = "test";
    }

    public MemberController() {
        this.testString = "test";
>>>>>>> main
    }
}
