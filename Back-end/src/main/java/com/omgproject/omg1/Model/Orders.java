package com.omgproject.omg1.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "Orders")
public class Orders {

    @Id
    @Basic
    private String Order_id;
    private Date OrderDate;


    private String Cart_id;


    private String Recp_id;

    private String User_id;

    private String Vend_id;

    @OneToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name="User",referencedColumnName = "User_id")
    @Column(insertable = false,updatable = false)
    private List<User> user;

    @OneToMany(targetEntity = Recipient.class,cascade = CascadeType.ALL)
    @JoinColumn(name="Recipient",referencedColumnName = "Recp_id")
    @Column(insertable = true,updatable = true)
    private List<Recipient> recipients;

    @OneToMany(targetEntity = Vendor.class,cascade = CascadeType.ALL)
    @JoinColumn(name="Vendor",referencedColumnName = "Vend_id")
    @Column(insertable = false,updatable = false)
    private List<Vendor> vendor;

    @OneToMany(targetEntity = Cart.class,cascade = CascadeType.ALL)
    @JoinColumn(name="Cart",referencedColumnName = "Cart_id")
    @Column(insertable = false,updatable = false)
    private List<Cart> carts;

//    public Orders(List<Vendor> vendor) {
//        this.vendor = vendor;
//    }
//
//    public List<Vendor> getVendor() {
//        return vendor;
//    }

//    public void setVendor(List<Vendor> vendor) {
//        this.vendor = vendor;
//    }




//    public void setUser(List<User> user) {
//        this.user = user;
//    }
//    @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="User_id")
//    private List<User> User;


    public Orders() {
    }

    public Orders(String order_id, Date orderDate, String cart_id, String recp_id, String user_id, String vend_id, List<User> user, List<Recipient> recipients, List<Vendor> vendor, List<Cart> carts) {
        this.Order_id = order_id;
        this.OrderDate = orderDate;
        this.Cart_id = cart_id;
        this.Recp_id = recp_id;
        this.User_id = user_id;
        this.Vend_id = vend_id;
        this.user = user;
        this.recipients = recipients;
        this.vendor = vendor;
        this.carts = carts;
    }

    public String getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(String order_id) {
        this.Order_id = order_id;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.OrderDate = orderDate;
    }

    public String getCart_id() {
        return Cart_id;
    }

    public void setCart_id(String cart_id) {
        this.Cart_id = cart_id;
    }

    public String getRecp_id() {
        return Recp_id;
    }

    public void setRecp_id(String recp_id) {
        this.Recp_id = recp_id;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String user_id) {
        this.User_id = user_id;
    }

    public String getVend_id() {
        return Vend_id;
    }

    public void setVend_id(String vend_id) {
        this.Vend_id = vend_id;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public List<Vendor> getVendor() {
        return vendor;
    }

    public void setVendor(List<Vendor> vendor) {
        this.vendor = vendor;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}



