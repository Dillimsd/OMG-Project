package com.omgproject.omg1.Repository.Omg;


import com.omgproject.omg1.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,String> {


//    @Query(value = "select u.user_id,Count(O.order_id) from Orders o join User u on u.user_id=O.user_id group by o.User_id",nativeQuery = true)
//    List<Orders> findOrdersByUserId(String user_id);

    @Query(value = "Select*from Orders Where User_id = :User_id",nativeQuery = true)
    List<Orders> findOrdersByUserId(@Param("User_id") String User_id);

//    @Query(value = "select u.user_id,o.order_id from Orders o join User u ",nativeQuery = true)
//    List<Orders> findOrdersById();




//    on u.user_id = o.user_id group by o.User_id"


//    @Query(value = "select u.user_id,Count(O.order_id) from omg.User u" +
//            "join omg.orders o" +
//            "on u.user_id=O.user_id" +
//            "group by o.User_id",nativeQuery = true)
//    public List<Orders> findUserByid();



//    List<Orders> getUserByid();







//    public default String add(Orders orders){
//        orders.add(orders);
//        return "Succesfully added";

//    @Query("select coalesce(max(a.Order_id), 0) from Order a")
//    public String findMaxId();


}





//    @Modifying
//    @Query(value = "insert into Local(User_id,User_name,User_mail,User_phone,User_addr) VALUES (1,Hello,Hello@gmail.com,1234567890,xyz street)", nativeQuery = true)
//    List<User> insertattributes(@Param("userId") Integer user_id, @Param("User_name") String User_name , @Param("User_mail")String User_mail, @Param("sUser_phone") String User_phone,@Param("User_addr")String User_addr);
//




