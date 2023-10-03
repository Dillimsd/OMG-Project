package com.omgproject.omg1.Service.Omg;

import com.omgproject.omg1.Repository.Omg.RecipientReopository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RecipientService {


    @Autowired
    RecipientReopository recipientReopository;

//    public Recipient update(String recp_id) {
//        Recipient recipient = findById(recp_id);
//        recipient.setRecp_id(recp_id);
//
//    }



//    public void updateRecp_id(String Recp_id){
//
//        Recipient recipient=findById(Recp_id);
//
//        recipient.setRecp_id(recipient.getRecp_id());
//        recipientReopository.save(recipient);
//    }



}


