package com.omgproject.omg1.IdGenerator;


import com.omgproject.omg1.Repository.Omg.CartRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneratorCart {

    @Autowired
    CartRepository cartRepository;

    public GeneratorCart(){

    }
    public String IdGenerator() throws HibernateException
    {
        String prefix ="CRT_";

        long CartCount = cartRepository.count();
        System.out.println(CartCount);

        String customId;
        customId = prefix + String.format("%03d",++CartCount);


        return customId;
    }
}
