package com.ayang.spring5.beanlife;

/**
 * @author Ayang
 * @date 2021/3/6 - 16:41
 */
public class BeanLife {
    public BeanLife() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 调用set方法设置属性值");
    }

    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");

    }
}
