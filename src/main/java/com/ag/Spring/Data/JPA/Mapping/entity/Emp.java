package com.ag.Spring.Data.JPA.Mapping.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empName;

    @OneToOne
    private Mobile mobile;

    // Using mappedBy for bidirectional relation
    @OneToMany(mappedBy = "emp", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Address> address;

    public Emp() {

    }

    public Emp(int id, String empName, Mobile mobile) {
        this.id = id;
        this.empName = empName;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
