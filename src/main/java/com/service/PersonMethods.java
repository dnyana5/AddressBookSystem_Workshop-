package com.service;

import com.module.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonMethods {
    ArrayList<Person> book = new ArrayList<>();

    public void add() {

        Person person = new Person();
        book.add(person);
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name whose details need to change  ");
        String name = scanner.nextLine();
        System.out.println("Enter the detail you have to edit");
        while (true) {
            System.out.println("Press 1 : Address\n\"Press 2 : City\nPress 3 : State\nPress 4 : Zip\nPress 5 : Phone Number\nPress 0 : Exit\"");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Address");
                    String address = scanner.next();
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstname().equalsIgnoreCase(name)) {
                            Person person = book.get(i);
                            person.setAddress(address);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the new City");
                    String City = scanner.next();
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstname().equalsIgnoreCase(name)) {
                            Person person = book.get(i);
                            person.setCity(City);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the new State");
                    String State = scanner.next();
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstname().equalsIgnoreCase(name)) {
                            Person person = book.get(i);
                            person.setState(State);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the new Zip");
                    int zip = scanner.nextInt();
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstname().equalsIgnoreCase(name)) {
                            Person person = book.get(i);
                            person.setZip(zip);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter the new Phone Number");
                    String Phone_Number = scanner.next();
                    for (int i = 0; i < book.size(); i++) {
                        if (book.get(i).getFirstname().equalsIgnoreCase(name)) {
                            Person person = book.get(i);
                            person.setPhone(Phone_Number);
                        }
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please Enter Correct Option");
            }
        }
    }

    public void show() {
        Iterator itr = book.iterator();
        while (itr.hasNext()) {
            Person person = (Person) itr.next();
            System.out.println("************************");
            System.out.println("Name- " + person.getFirstname() + " " + person.getLastname()+
                                "\nAddress- " + person.getAddress() + "\nCity- " + person.getCity() +
                                "\nState- " + person.getState() + "\nZip- " + person.getZip() +
                                "\nPhone Number- " + person.getPhone() + "\nEmail - " + person.getEmail());
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  name whose details need to delete from address book");
        String name = scanner.nextLine();
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getFirstname().equalsIgnoreCase(name) ||
                    book.get(i).getLastname().equalsIgnoreCase(name)) {
                Person person = book.get(i);
                book.remove(person);
            }
        }
        System.out.println("contact deleted!!");
    }
}
