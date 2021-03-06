package com.ayang.spring5.Annotation.Service;

import com.ayang.spring5.Annotation.Dao.UserDao;
import com.ayang.spring5.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Ayang
 * @date 2021/3/7 - 1:32
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void add(){
        System.out.println("service add.......");
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
