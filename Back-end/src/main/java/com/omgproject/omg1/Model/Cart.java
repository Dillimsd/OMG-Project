package com.omgproject.omg1.Model;


import jakarta.persistence.*;

import java.util.List;

@Entity

public class Cart {
    @Id
    @PrimaryKeyJoinColumn
    private String Cart_id;
    private String Cus_id;
    private Integer Bill_amt;
    private Integer Qut;


    private String User_id;

    @OneToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name="User",referencedColumnName = "User_id")
    @Column(insertable = false,updatable = false)
    private List<User> user;

    public Cart() {
    }

    public Cart(String cart_id, String cus_id, Integer bill_amt, Integer qut, String user_id, List<User> user) {
        this.Cart_id = cart_id;
        this.Cus_id = cus_id;
        this.Bill_amt = bill_amt;
        this.Qut = qut;
        this.User_id = user_id;
//        this.user = user;
    }

    public String getCart_id() {
        return Cart_id;
    }

    public void setCart_id(String cart_id) {
        this.Cart_id = cart_id;
    }

    public String getCus_id() {
        return Cus_id;
    }

    public void setCus_id(String cus_id) {
        this.Cus_id = cus_id;
    }

    public Integer getBill_amt() {
        return Bill_amt;
    }

    public void setBill_amt(Integer bill_amt) {
        this.Bill_amt = bill_amt;
    }

    public Integer getQut() {
        return Qut;
    }

    public void setQut(Integer qut) {
        this.Qut = qut;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String user_id) {
        this.User_id = user_id;
    }

//    public List<User> getUser() {
//        return user;
//    }
//
//    public void setUser(List<User> user) {
//        this.user = user;
    }

