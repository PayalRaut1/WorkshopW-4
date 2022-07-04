package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

 public class AddressBookMain {

        public static void main(String[] args) {

            List<Contact> listContact = new ArrayList<Contact>();

            AddressBook addressBook1 = new AddressBook();
            Contact contact = new Contact("Payal", "Raut", "Mumbai");
            Contact contact1 = new Contact("Pooja", "Thakre", "Pune");
            Contact contact2 = new Contact("Ekta", "Shende", "Nagpur");
            Contact contact3 = new Contact("Saloni", "Meshram", "Nashik");

            AddressBook addressBook2 = new AddressBook();
            Contact contact5 = new Contact("Pranoti", "Kedar", "Nagpur");
            Contact contact6 = new Contact("Mansi", "Chore", "Nagpur");

            addressBook1.listContact.add(contact);
            addressBook1.listContact.add(contact1);
            addressBook1.listContact.add(contact2);
            addressBook1.listContact.add(contact3);

            addressBook2.listContact.add(contact5);
            addressBook2.listContact.add(contact6);

            Map<String, AddressBook> addressBookMap = new LinkedHashMap<>();
            addressBookMap.put("addressBook1", addressBook1);
            addressBookMap.put("addressBook2", addressBook2);

            Map<String, List<Contact>> cityMap = new LinkedHashMap<>();

            for(Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {

                AddressBook addressBook = addressBookMap.get(entry.getKey());
                addressBook.listContact.stream().forEach(element -> {
                    if(cityMap.containsKey(element.getCity())) {
                        List<Contact> list = cityMap.get(element.getCity());
                        list.add(element);
                    } else {
                        List<Contact> list = new ArrayList<>();
                        list.add(element);
                        cityMap.put(element.getCity(), list);
                    }
                });
            }
            System.out.println(cityMap);
        }


    }
