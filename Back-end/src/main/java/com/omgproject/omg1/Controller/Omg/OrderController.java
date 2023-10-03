package com.omgproject.omg1.Controller.Omg;


import com.omgproject.omg1.IdGenerator.*;
import com.omgproject.omg1.Model.*;
import com.omgproject.omg1.Repository.Omg.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")

public class OrderController {
    @Autowired
    OrdersRepository ordersRepository;
    @Autowired
    UserRepository userRepository;

//    @Autowired
//    RecipientService recipientService;

//    @Autowired
//    CartRepository cartRepository;
//    @Autowired
//    VendorRepository vendorRepository;

    @Autowired
    RecipientReopository recipientReopository;
    @Autowired
    GeneratorRecipient generatorRecipient;
    @Autowired
    VendorRepository vendorRepository;
    @Autowired
    GeneratorCart generatorCart;
    @Autowired
    GenerateVendor generateVendor;
    @Autowired
    GenerateUser generateUser;

    @Autowired
    GenerateOrders generateOrders;

    @PostMapping("/addOrder")
    public Orders createOrder(@RequestBody Orders orders){
        orders.setOrder_id((generateOrders.IdGenerator()));
        return ordersRepository.save(orders);
    }


//    @Autowired
//    UserRepository userRepository;

//    @PostMapping("/addCart")
//    public Cart createCart(@RequestBody Cart cart){
//        cart.setCart_id((generatorRecipient.IdGenerator()));
//        return cartRepository.save(cart);
//    }
    @PostMapping("/addVendor")
    public Vendor createVendor(@RequestBody Vendor vendor){
        vendor.setVend_id((generateVendor.IdGenerator()));
        return vendorRepository.save(vendor);
    }

    @PostMapping("/addrecipient")
    public  Recipient createRecipient(@RequestBody Recipient recipient){
        recipient.setRecp_id((generatorRecipient.IdGenerator()));
        recipient.setOrder_id(generateOrders.IdGenerator());
        return recipientReopository.save(recipient);
    }

//    public Recipient createRecipient (@RequestBody Recipient recipient){
//        recipient.getOrder_id((generatorRecipient.IdGenerator()));
//        return recipientReopository.save(recipient);
//    }
//    @PostMapping("/addOrder")
//    public  Orders createOrder(@RequestBody Orders orders){
//        orders.setOrder_id((generatorRecipient.IdGenerator()));
//        return ordersRepository.save(orders);
//    }

    @PostMapping("/addUser")
    public User createUser(@RequestBody User user){
        user.setUser_id((generateUser.IdGenerator()));
        return userRepository.save(user);
    }



//    @GetMapping("/recipientcount")
//    public Long countRecipient(){
//        Long a=recipientReopository.count();
//        return a;
//    }
    @GetMapping("/GetRecipient")
    public List<Recipient> getrecipient(){
        return recipientReopository.findAll();
    }



    @PostMapping("/addRecipient")
    public Recipient addRecipient(@RequestBody Recipient recipient) {
        return recipientReopository.save(recipient);
    }

    @PostMapping("/saverecipi")
    public void saveRecipient(){
        Recipient recipient = new Recipient();
        recipientReopository.save(recipient);

    }


 @RequestMapping(value = "/saverec")
//    ,method = RequestMethod.POST,
//    consumes = APPLICATION_FORM_URLENCODED_VALUE,
//    produces = {APPLICATION_ATOM_XML_VALUE,
//            APPLICATION_JSON_VALUE}
//
    public String save(@Validated  Recipient recipient){
        recipientReopository.save(recipient);

        return "success";
    }

//    public Recipient saveRecipient(@ModelAttribute("recipient") Recipient recipient) {
//        return recipientService.update(recipient.getRecp_id());
//    }



//    @GetMapping("/Getcart")
//    public List<Cart> getCart(){
//        return cartRepository.findAll();
//    }


//    @GetMapping("/getOrder/{User_id}")
//    public Orders getOrder(@PathVariable String User_id){
//        return (Orders) ordersRepository.findOrdersByUserId(User_id);
    @GetMapping("/GetOrdersById/{User_id}")
    public List<Orders> getOrdersHistoryById(@PathVariable String User_id){
        return  ordersRepository.findOrdersByUserId(User_id);

    }
    @GetMapping("/GetAllOrders")
    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }
//    @GetMapping("/GetOrder/{Order_id}")
//    public Optional<Orders> getOrder(@PathVariable String Order_id){
//        return ordersRepository.findById(Order_id);
//    }




//    @PostMapping("/addOrder")
//    public Orders creatOrders(@RequestBody Orders orders){
//        return  ordersRepository.save(orders);
//    }
//
//
//
}

