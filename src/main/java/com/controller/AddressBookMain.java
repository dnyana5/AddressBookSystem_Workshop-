package com.controller;

import com.service.PersonMethods;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        PersonMethods personmethods = new PersonMethods();
        personmethods.add();
    }
}

