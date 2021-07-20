/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesserverTTS.tesServerTTS.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author aqira
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Basic(optional = false)
    @Column(name = "id", length = 5)
    private String id;

    @Column(name = "first_name", length = 50)
     String firstName;

    @Column(name = "last_name", length = 100)
     String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @OneToOne(mappedBy = "employee")
    private Account account;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String address, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.isDeleted = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

}
