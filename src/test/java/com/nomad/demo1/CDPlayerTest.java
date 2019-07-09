package com.nomad.demo1;

import com.nomad.demo2.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=CDPlayerConfig.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//@ContextConfiguration("classpath:applicationContext.xml")
//@ContextConfiguration(classes = SoundSystemConfig.class)
//@ContextConfiguration("classpath:soundSystemConfig.xml")
//@ContextConfiguration(classes = DataSourceConfig.class)
//@ContextConfiguration("classpath:dataSource.xml")
//@ActiveProfiles("dev")
//@ContextConfiguration(classes = MagicBeanConfig.class)
//@ContextConfiguration(classes = FoodConfig.class)
@ContextConfiguration(classes = ScopeConfig.class)
public class CDPlayerTest<standardoutputs> {

    //第二章测试代码
    /*@Autowired(required = false)  //@Inject
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
    }*/


    //第三章测试代码
    /*@Autowired
    private DataSource dataSource;

    @Test  //sql脚本为空，所以测试失败
    public void dataSourceNotBeNull() {
        assertNotNull(dataSource);
    }*/

    /*@Autowired
    private MagicBean mb;

    @Test
    public void magicBeanNotBeNull() {
        assertNotNull(mb);
    }*/

    /*@Autowired
    private Food food;

    @Test
    public void dessertNotBeNull() {
        assertNotNull(food);
        food.getDessert();
    }*/

    @Autowired
    private NotePad notePad;

    @Autowired
    private StoreService storeService;

    @Test
    public void notePadNotBeNull(){
        assertNotNull(notePad);
        assertNotNull(storeService);
    }
}
