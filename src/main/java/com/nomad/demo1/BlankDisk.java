package com.nomad.demo1;

import java.util.List;

public class BlankDisk implements CompactDisc {
    private String title;
    private String content;
    private List<String> tracks;


    public BlankDisk(String title, String content, List<String> tracks) {
        this.title = title;
        this.content = content;
        this.tracks = tracks;
    }

    public BlankDisk() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("title:" + title + "\ncontent:" + content);
        for (int i = 0; i < tracks.size(); i++) {
            String s = tracks.get(i);
            System.out.println("track:" + s);
        }
    }

}
