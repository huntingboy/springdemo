package com.nomad;

public class WhiteAlbum implements CompactDisc {
    private String title = "WhiteAlbum";
    private String content = "content:helloworld!!!";

    public void play() {
        System.out.println("title:" + title + "\n content:" + content);
    }
}
