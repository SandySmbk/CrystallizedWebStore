package com.fh.webshopdemo.demo.dtos;

public class UserDTO {
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String street_adress;
    private Long street_number;
    private String city;
    private Long postal_code;
    private String country;


    //getter und setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStreet_adress() {
        return street_adress;
    }
    public void setStreet_adress(String street_adress) {
        this.street_adress = street_adress;
    }
    public Long getStreet_number() {
        return street_number;
    }
    public void setStreet_number(Long street_number) {
        this.street_number = street_number;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Long getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(Long postal_code) {
        this.postal_code = postal_code;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}