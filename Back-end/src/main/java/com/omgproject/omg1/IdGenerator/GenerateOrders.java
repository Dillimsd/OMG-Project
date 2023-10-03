package com.omgproject.omg1.IdGenerator;


import com.omgproject.omg1.Repository.Omg.RecipientReopository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateOrders {
    @Autowired
    RecipientReopository recipientReopository;

    public GenerateOrders(){

    }
    public String IdGenerator() throws HibernateException
    {
        String prefix ="ORD_";

        long OrdersCount = recipientReopository.count();
        System.out.println(OrdersCount);

        String customId;
        customId = prefix + String.format("%03d",++OrdersCount);


        return customId;
    }

}
