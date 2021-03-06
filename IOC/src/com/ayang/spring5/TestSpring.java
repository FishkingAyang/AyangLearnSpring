package com.ayang.spring5;

import com.ayang.spring5.Annotation.Dao.UserDao;
import com.ayang.spring5.Annotation.Service.UserService;
import com.ayang.spring5.beanlife.BeanLife;
import com.ayang.spring5.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ayang
 * @date 2021/3/6 - 14:47
 */
public class TestSpring {

    @Test
    public void testUser(){
        // 1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println("user = " + user);
        user.add();
    }

    @Test
    public void testBook(){
        // 1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println("book = " + book);
    }
    
    @Test
    public  void testOrder(){
        // 1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置创建的对象
        Order order = context.getBean("order",Order.class);

        System.out.println("order = " + order);
    }
    @Test
    public void testBook2(){
        // 1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置创建的对象
        Book book = context.getBean("book2", Book.class);
        System.out.println("book2 = " + book);
    }
    
    @Test
    public void testStu(){
        // 1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        // 2.获取配置创建的对象
        Stu stu = context.getBean("stu",Stu.class);
        System.out.println("stu = " + stu);
    }
    
    @Test
    public void testFactory() {
        // 1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        // 2.获取配置创建的对象
        Book book = context.getBean("myBean", Book.class);
        System.out.println("book = " + book);
    }
    
    @Test
    public void testUser2() {
        //1. 加载java配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user1 = context.getBean("userSingle",User.class);
        System.out.println("user1 = " + user1);
        User user2 = context.getBean("userSingle",User.class);
        System.out.println("user2 = " + user2);

        User user3 = context.getBean("userPro",User.class);
        System.out.println("user3 = " + user3);
        User user4 = context.getBean("userPro",User.class);
        System.out.println("user4 = " + user4);
    }

    @Test
    public void testBeanLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        BeanLife beanLife = context.getBean("beanLife",BeanLife.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println("beanLife = " + beanLife);
        context.close();
    }

    @Test
    public void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("userService = " + userService);
        userService.add();
    }

    @Test
    public void testAnnotation2() {
        //加载配置类
        ApplicationContext context
                =  new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
    }
}
