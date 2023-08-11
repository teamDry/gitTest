package com.example.gittest.controller;

public class TestController {
    private String test;

    public TestController(String test) {
        this.test = test;
    }

    public void objectTest() {
        System.out.println("object Test!");
    }

    public void printTest() {
        System.out.println(test);
    }

    public void printA() {
        System.out.println("hi");
    }


}
