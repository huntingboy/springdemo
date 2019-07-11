package com.nomad.demo3;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class BlankDisk implements CompactDisc {
    private String title;
    private String content;
    private List<String> tracks;

    /*public BlankDisk(String title, String content) {  //ExpressiveConfig中使用environment
        this.title = title;
        this.content = content;
    }*/

    public BlankDisk(  //使用占位符,需配置PropertySourcePlaceholderConfigurer
                       @Value("${disc.title}") String title,
                       @Value("${disc.content}") String content) {
        this.title = title;
        this.content = content;
    }

    /*public BlankDisk(  //使用SpEL spring EL表达式
            @Value("#{disc.title}") String title,
            @Value("#{disc.content}") String content) {
        this.title = title;
        this.content = content;
    }*/

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

    public void playTrack(int trackNumber) {
        System.out.println("title:" + title + "\ncontent:" + content + "\ntrackNumber:" + trackNumber);
    }

}
