package com.omgproject.omg1.Controller.Omg;


import com.omgproject.omg1.Model.User;
import com.omgproject.omg1.Repository.Omg.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController

public class UserController {
//    @Autowired
//    private UserServiceImp userServiceImp;
    @Autowired
    UserRepository userRepository;
//    @Autowired
//    VendorRepository vendorRepository;
//    @Autowired
//    ProductRepository productRepository;




//    @GetMapping("/getUserById/{User_id}")
//    public

//    List<User> fetchDetailsById(@PathVariable String User_id) {
//        return (List<User>) userRepository.getReferenceById(User_id);



    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
//    @GetMapping("/GetProduct")
//    public List<Product> getAllProduct(){
//        return productRepository.findAll();


//    @GetMapping("/VendorList")
//    public List<Vendor> getAllVendor(){
//        return vendorRepository.findAll();
//    }



//    @GetMapping ("/users/{User_id}")
//    public Optional<User> getUser(@PathVariable String User_id) {
//        return userRepository.findById(User_id);
//    }
@GetMapping("/GetUser/{User_id}")
public Optional<User> getUser(@PathVariable String User_id){
        return userRepository.findById(User_id);
}







//    @GetMapping("/User/User_nameandUser_city")
//    public ResponseEntity<List<User>>getUserandCity(@RequestParam String User_name,
//                                                               @RequestParam String User_City) {
//        return new ResponseEntity<List<User>>(userRepository.getUserandCity(User_name,User_City), HttpStatus.OK);




//    @PostMapping("/addUser")
//    public User creatUser(@RequestBody User user) {
//        return userRepository.save(user);
//    }

//    @PatchMapping("/updateUser/{User_id}")
//    public User updateUser() {
//        return userServiceImp.updateUser(updateUser());

//
//    @PostMapping("/addUser")
//    public User userDetails (@RequestBody ){
//        return UserServiceImp.saveDetails(user);
//    }

}


