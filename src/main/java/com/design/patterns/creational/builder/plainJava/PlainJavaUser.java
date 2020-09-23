package com.design.patterns.creational.builder.plainJava;

public class PlainJavaUser {

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String email;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public PlainJavaUser setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public PlainJavaUser setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PlainJavaUser setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PlainJavaUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PlainJavaUser setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "PlainJavaUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
