package com.nomad;

import org.springframework.stereotype.Component;

//@Component("cd")  //@Named
public class SgtPeppers implements CompactDisc {

    private String title = "SgtPeppers";
    private String content = "content:helloworld!!!";

    public void play() {
        System.out.println("title:" + title + "\n content:" + content);

    }
}
