package com.nomad.demo1;

public class HardDaysNight implements CompactDisc {
    private String title = "HardDaysNight";
    private String content = "content:helloworld!!!";

    public void play() {
        System.out.println("title:" + title + "\n content:" + content);
    }
}
