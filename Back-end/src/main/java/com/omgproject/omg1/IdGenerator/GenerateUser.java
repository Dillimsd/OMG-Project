package com.omgproject.omg1.IdGenerator;


import com.omgproject.omg1.Repository.Omg.UserRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateUser {

    @Autowired
    UserRepository userRepository;

    public GenerateUser(){

    }
    public String IdGenerator() throws HibernateException
    {
        String prefix ="USR_";

        long UserCount = userRepository.count();
        System.out.println(UserCount);

        String customId;
        customId = prefix + String.format("%03d",++UserCount);


        return customId;
    }
}
