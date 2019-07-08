package com.nomad.demo1;

public class Revolver implements CompactDisc {
    private String title = "Revolver";
    private String content = "content:helloworld!!!";

    public void play() {
        System.out.println("title:" + title + "\n content:" + content);
    }
}
