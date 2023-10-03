package com.omgproject.omg1.Repository.Omg;

import com.omgproject.omg1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {


//        @Query(value = "select u.user_id,o.order_id from User u join Orders o on u.user_id = o.user_id group by o.User_id",nativeQuery = true)
//    List<User> findById();
}



//    @Query
//            ("SELECT u.User_name,o.Order_id FROM User u JOIN u.Orders o")
//            public User getReferenceById(String User_id);


//        nativeQery = true,
//    value
//    = "select u.user_id,Count(O.order_id) from omgprojectomgdemoproject.User u join omg.orders o on u.user_id=O.user_id group by o.User_id; "
//



    //    List<User> findAllById();


//    List<User> getUserandCity(String User_name,String User_City);

//    public List<User> findById();


//    @Query("select coalesce(max(a.User_id),0) from User a")
//   public String findMaxId();



