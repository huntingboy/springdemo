package com.nomad.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.nomad", "com.hello", "com.world"})
//@ComponentScan(basePackageClasses = {CDPlayerConfig.class, CDPlayer.class, MediaPlayer.class})
//@Import(CDConfig.class)
public class CDPlayerConfig {

    /*@Bean(name="cd") //默认id:sgtPeppers
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }*/

    /*@Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return  new SgtPeppers();
        } else if (choice == 1) {
            return  new WhiteAlbum();
        }else if (choice == 2) {
            return  new HardDaysNight();
        }else  {
            return  new Revolver();
        }
    }*/

    /*@Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }*/

    @Bean
    public CDPlayer cdPlayer1(CompactDisc compactDisc) {
        CDPlayer player = new CDPlayer(compactDisc);
        player.insertDisc(compactDisc);
        return player;
    }
}
