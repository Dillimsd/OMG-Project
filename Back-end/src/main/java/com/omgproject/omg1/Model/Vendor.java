package com.omgproject.omg1.Model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Vendor")
public class Vendor {

    @Id
    @Basic
    private String Vend_id;
    private String Vend_name;
    private String Vend_email;
    private Long Vend_phone;
    private String Vend_addr;

    public Vendor() {
    }

    public Vendor(String vend_id, String vend_name, String vend_email, Long vend_phone, String vend_addr) {
        this.Vend_id = vend_id;
        this.Vend_name = vend_name;
        this.Vend_email = vend_email;
        this.Vend_phone = vend_phone;
        this.Vend_addr = vend_addr;
    }

    public String getVend_id() {
        return Vend_id;
    }

    public void setVend_id(String vend_id) {
        this.Vend_id = vend_id;
    }

    public String getVend_name() {
        return Vend_name;
    }

    public void setVend_name(String vend_name) {
        this.Vend_name = vend_name;
    }

    public String getVend_email() {
        return Vend_email;
    }

    public void setVend_email(String vend_email) {
        this.Vend_email = vend_email;
    }

    public Long getVend_phone() {
        return Vend_phone;
    }

    public void setVend_phone(Long vend_phone) {
        this.Vend_phone = vend_phone;
    }

    public String getVend_addr() {
        return Vend_addr;
    }

    public void setVend_addr(String vend_addr) {
        this.Vend_addr = vend_addr;
    }
}
