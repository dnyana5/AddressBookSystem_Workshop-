package com.service;

import com.module.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMethods {
    ArrayList<Person> book =new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {

        Person addressService = new Person();
        System.out.print("Enter First name:");
        addressService.setFirstname(scanner.next());
        System.out.print("Enter last name:");
        addressService.setLastname(scanner.next());
        System.out.print("Enter your address:");
        addressService.setAddress(scanner.next());
        System.out.print("Enter your city:");
        addressService.setCity(scanner.next());
        System.out.print("Enter your state:");
        addressService.setState(scanner.next());
        System.out.print("Enter your ZIP code:");
        addressService.setZip(scanner.nextInt());
        System.out.print("Enter your phone number:");
        addressService.setPhone(scanner.next());
        System.out.print("Enter your email:");
        addressService.setEmail(scanner.next());
        book.add(addressService);
    }
}
