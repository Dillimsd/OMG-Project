package com.omgproject.omg1.Service.Omg;

import com.omgproject.omg1.Model.User;
import com.omgproject.omg1.Repository.Omg.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {

    @Autowired
    UserRepository userRepository;

    public User getUserDetailsById(String User_id) {
        return userRepository.findById(User_id).orElse(null);
    }





//    public User findAllById(String User_id) {
//        return userRepository.findAllById()
    }

//    public User getById(String UserId) {
//        return userRepository.findAllById(UserId);




//    public User getUser(String User_Id) {
//        return userRepository.getById(User_Id);

//
//    public User createUser(User user) {
//        user.setUser_id(userRepository.findMaxId() + 1);
//        return userRepository.save(user);
//    }

//    public User updateUser(User user) {
//        Optional<User> optionalUser = userRepository.findById(user.getUser_id());
//        if (optionalUser.isPresent()){
//            User userRecord = optionalUser.get();
//            userRecord.setUser_name(user.getUser_email());
//            userRecord.setUser_email(user.getUser_email());
//            userRecord.setUser_pwd(userRecord.getUser_pwd());
//            userRecord.setUser_addr(user.getUser_addr());
//            userRecord.setUser_city(user.getUser_city());
//            userRecord.setUser_phone(user.getUser_phone());
////            userRecord.setStatus(StringUtils.defaultIfBlank(s.getStatus(), houseRecord.getStatus()));
//            return userRepository.save(userRecord);
//        }
//        else{
//            return null;
//        }


//    public Optional<User> findById(String User_id) {
//        return userRepository.findById(User_id);





    //post
//   public static User saveDetails(User user) {
//    return userRepository.save(user);
//   }


//    public User createUser(User user) {
//        user.setUser_id(String.valueOf(userRepository.findMaxId() + 1));
//        return userRepository.save(user);








