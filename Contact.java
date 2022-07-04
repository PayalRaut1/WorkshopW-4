package com.bridgelabz.addressbook;
public class Contact {

    String firstName;
    String lastName;
    String city;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public Contact(String firstName, String lastName, String city) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city +"]" ;
    }

}

