package com.omgproject.omg1.IdGenerator;


import com.omgproject.omg1.Repository.Omg.VendorRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateVendor {

    @Autowired
    VendorRepository vendorRepository;

    public GenerateVendor(){

    }
    public String IdGenerator() throws HibernateException
    {
        String prefix ="VEN_";

        long VendorCount = vendorRepository.count();
        System.out.println(VendorCount);

        String customId;
        customId = prefix + String.format("%03d",++VendorCount);


        return customId;
    }


}
