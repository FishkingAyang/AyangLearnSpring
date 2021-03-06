package com.ayang.spring5.factory;

import com.ayang.spring5.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Ayang
 * @date 2021/3/6 - 15:48
 */
public class MyBean implements FactoryBean<Book> {
    @Override
    public Book getObject() {
        Book book = new Book();
        book.setName("abc");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
