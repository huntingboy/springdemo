package com.nomad.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc setPeppers() {
        BlankDisk cd = new BlankDisk();
        cd.setTitle("标题");
        cd.setContent("内容");
        List<String> tracks = new ArrayList<String>();
        tracks.add("第一首");
        tracks.add("第二首");
        tracks.add("第三首");
        tracks.add("第四首");
        tracks.add("第五首");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
