package com.omgproject.omg1.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipient")
public class Recipient {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//            SEQUENCE,generator = "demo_sql")
//    @GenericGenerator(name = "demo_sql", strategy = "com.omgproject.omg1.Model.StringPrefixedSequenceGenerator",parameters = {
//            @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceGenerator.INCREMENT_PARAM,value = "05"),
//            @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceGenerator.VALUE_PREFIX_PARAMETER,value = "R_"),
//            @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceGenerator.NUMBER_FORMAT_PARAMATER,value = "%05d")
//    })
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long autoIncrement;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "org.hibernate.id.UUIDGenerator"
//    )
//    @Column(updatable = false, nullable = false)

//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "uuid2")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(generator = "recpid_generator")
//    @GenericGenerator(name = "recpid_generator",strategy = )
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GenericGenerator(name = "recpid_generator",strategy = "com.omgproject.omg1.IdGenerator.Generator")
    private String recp_id;
    private String recp_name;
    private String recp_addr;
    private Long recp_phone;

    private String order_id;


    public Recipient() {
    }

    public Recipient(String order_id) {
        this.order_id = order_id;
    }

    public Recipient(String recp_id, String recp_name, String recp_addr, Long recp_phone) {
        this.recp_id = recp_id;
        this.recp_name = recp_name;
        this.recp_addr = recp_addr;
         this.recp_phone = recp_phone;

    }

    public String getOrder_id(String s) {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getRecp_id() {
        return recp_id;
    }

    public void setRecp_id(String recp_id){this.recp_id = recp_id;

    }

    public String getRecp_name() {
        return recp_name;
    }

    public void setRecp_name(String recp_name) {
        this.recp_name = recp_name;
    }

    public String getRecp_addr() {
        return recp_addr;
    }

    public void setRecp_addr(String recp_addr) {
        this.recp_addr = recp_addr;
    }

    public Long getRecp_phone() {
        return recp_phone;
    }

    public void setRecp_phone(Long recp_phone) {
        this.recp_phone = recp_phone;
    }

//    public static void SetRecp_id(String recp_id) {
//    }

//    public void SetRecp_id(String Recp_id) {
//        setRecp_id();
//    }


//    public void SetRecp_id(String Recp_id) {this.Recp_id = recp_id;
//    }
}
