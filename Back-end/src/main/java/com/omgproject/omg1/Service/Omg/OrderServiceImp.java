package com.omgproject.omg1.Service.Omg;

import com.omgproject.omg1.Model.Orders;
import com.omgproject.omg1.Repository.Omg.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp {

    @Autowired
    OrdersRepository ordersRepository;


    public List<Orders> getAllOrder() {
        return ordersRepository.findAll();




//    public Orders creatorders(Orders orders){
//        orders.setOrder_id(ordersRepository.findMaxId() +1);
//        return ordersRepository.save(orders);
//    }

    }



    }


