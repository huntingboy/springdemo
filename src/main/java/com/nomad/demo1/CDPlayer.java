package com.nomad.demo1;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

//@Named
//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    public CDPlayer() {
    }

    //    @Inject
    //    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
