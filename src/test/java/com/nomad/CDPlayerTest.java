package com.nomad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=CDPlayerConfig.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//@ContextConfiguration("classpath:applicationContext.xml")
//@ContextConfiguration(classes = SoundSystemConfig.class)
@ContextConfiguration("classpath:soundSystemConfig.xml")
public class CDPlayerTest<standardoutputs> {

    @Autowired(required = false)  //@Inject
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
//        ApplicationContext factory = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
//        cd = (CompactDisc) factory.getBean("cd");
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
//        assertEquals("title:first page\n content:content:helloworld!!!",
//                log.get);
    }
}
