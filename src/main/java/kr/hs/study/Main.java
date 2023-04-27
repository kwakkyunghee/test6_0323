package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        obj1.prData();

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        obj2.prData();

        ctx.close();
    }
}