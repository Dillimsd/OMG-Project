package com.omgproject.omg1.IdGenerator;

import com.omgproject.omg1.Repository.Omg.RecipientReopository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GeneratorRecipient {
    @Autowired
    private RecipientReopository recipientReopository;

    public GeneratorRecipient(){

    }
    public String IdGenerator() throws HibernateException
    {
        String prefix ="RCP_";

        long RecipientCount = recipientReopository.count();
        System.out.println(RecipientCount);

        String customId;
        customId = prefix + String.format("%03d",++RecipientCount);


        return customId;
    }
}
