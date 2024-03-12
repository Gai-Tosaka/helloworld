package com.helloworld.hello;

public class HelloName {
    private String name;
    public HelloName(String name) {
        this.name = name + "さん！　こんにちは！";
    }
    public String getName() {
        return name;
    }
}
