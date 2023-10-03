package com.omgproject.omg1.Model;


import jakarta.persistence.*;
import lombok.Getter;


@Getter
@Entity
@Table(name = "User")
public class User{
    @Id
    @Basic
    @PrimaryKeyJoinColumn
    private String User_id;

    private String User_name;
    private String User_email;
    private String User_pwd;
    private Long User_phone;
    private String User_city;
    private String User_addr;

//    @OneToMany(targetEntity = Orders.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = )

    public User() {
    }

    public User(String user_id, String user_name, String user_email, String user_pwd, Long user_phone, String user_city, String user_addr) {
        this.User_id = user_id;
        this.User_name = user_name;
        this.User_email = user_email;
        this.User_pwd = user_pwd;
        this.User_phone = user_phone;
        this.User_city = user_city;
        this.User_addr = user_addr;
    }

    public void setUser_id(String user_id) {
        this.User_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.User_name = user_name;
    }

    public void setUser_email(String user_email) {
        this.User_email = user_email;
    }

    public void setUser_pwd(String user_pwd) {
        this.User_pwd = user_pwd;
    }

    public void setUser_phone(Long user_phone) {
        this.User_phone = user_phone;
    }

    public void setUser_city(String user_city) {
        this.User_city = user_city;
    }

    public void setUser_addr(String user_addr) {
        this.User_addr = user_addr;
    }
}



