//package com.omgproject.omg1.Model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Builder;
//
//@Entity
//@Table(name = "Customization")
//@Builder
//public class Customization {
//
//    @Id
//    @Column
//    private  String Custz_id;
//    private  String Custz_text;
//    private String Custz_color;
//    private String Custz_shape;
//    private Long Image_id;

//    @OneToOne(targetEntity = com.omgproject.omg1.Model.CustzImage.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="Image_id",referencedColumnName = "Image_id")
//    private List<CustzImage> custzImages;






