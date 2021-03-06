package com.ayang.spring5.Annotation.Dao;

import com.ayang.spring5.Annotation.Service.UserService;
import com.ayang.spring5.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Ayang
 * @date 2021/3/7 - 2:47
 */
@Component
public class UserDao {

    @Value(value = "12")
    private int num;

    @Override
    public String toString() {
        return "UserDao{" +
                "num=" + num +
                '}';
    }
}
