//package com.omgproject.omgdemoproject.Model;
//
//
//import jakarta.persistence.*;
//import lombok.Builder;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Table(name = "Product")
//@Data
//@Builder
//public class Product {
//
//    @Id
//    @Column
//    private String Prod_id;
//
//    private String Prod_name;
//    private Integer Prod_price;
//    private String prod_desc;
//    private Boolean Is_custz;
//    private String Sugg_chc;
//    private String Vend_id;
//    @Lob
//    @Column(name = "prod_img",length =1000)
//    private byte[] Prod_img;
//
//    @OneToMany(targetEntity = Vendor.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="Vend_id",referencedColumnName = "Vend_id")
//    private List<Vendor> vendor;
//
//    public Product() {
//    }
//
//    public Product(String prod_id, String prod_name, Integer prod_price, String prod_desc, Boolean is_custz, String sugg_chc, String vend_id, byte[] prod_img, List<Vendor> vendor) {
//        this.Prod_id = prod_id;
//        this.Prod_name = prod_name;
//        this.Prod_price = prod_price;
//        this.prod_desc = prod_desc;
//        this.Is_custz = is_custz;
//        this.Sugg_chc = sugg_chc;
//        this.Vend_id = vend_id;
//        this.Prod_img = prod_img;
//        this.vendor = vendor;
//    }
//
//    public String getProd_id() {
//        return Prod_id;
//    }
//
//    public void setProd_id(String prod_id) {
//        this.Prod_id = prod_id;
//    }
//
//    public String getProd_name() {
//        return Prod_name;
//    }
//
//    public void setProd_name(String prod_name) {
//        this.Prod_name = prod_name;
//    }
//
//    public Integer getProd_price() {
//        return Prod_price;
//    }
//
//    public void setProd_price(Integer prod_price) {
//        this.Prod_price = prod_price;
//    }
//
//    public String getProd_desc() {
//        return prod_desc;
//    }
//
//    public void setProd_desc(String prod_desc) {
//        this.prod_desc = prod_desc;
//    }
//
//    public Boolean getIs_custz() {
//        return Is_custz;
//    }
//
//    public void setIs_custz(Boolean is_custz) {
//        this.Is_custz = is_custz;
//    }
//
//    public String getSugg_chc() {
//        return Sugg_chc;
//    }
//
//    public void setSugg_chc(String sugg_chc) {
//        this.Sugg_chc = sugg_chc;
//    }
//
//    public String getVend_id() {
//        return Vend_id;
//    }
//
//    public void setVend_id(String vend_id) {
//        this.Vend_id = vend_id;
//    }
//
//    public byte[] getProd_img() {
//        return Prod_img;
//    }
//
//    public void setProd_img(byte[] prod_img) {
//        this.Prod_img = prod_img;
//    }
//
//    public List<Vendor> getVendor() {
//        return vendor;
//    }
//
//    public void setVendor(List<Vendor> vendor) {
//        this.vendor = vendor;
//    }
//}
