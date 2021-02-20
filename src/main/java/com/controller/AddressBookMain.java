package com.controller;

import com.service.PersonMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    void address_Book(PersonMethods personMethods) {
        int input, ans;
        PersonMethods personmethods = new PersonMethods();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add a contact\n2.Edit a contact\n3.Show contacts\n4.Delete contact\n");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    personmethods.add();
                    break;
                case 2:
                    personmethods.edit();
                    break;
                case 3:
                    personmethods.show();
                    break;
                case 4:
                    personmethods.delete();
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue with same address book?\n1.yes\n2.no");
            ans = scanner.nextInt();
        } while (ans == 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBookMain addr = new AddressBookMain();
        addr.repeatProcedure();

    }

    public void repeatProcedure() {
        Map<String, PersonMethods> addressMap = new HashMap<>();
        String bookName;
        int a;
        do {
            System.out.println("Enter name of address book");
            Scanner sc = new Scanner(System.in);
            bookName = sc.nextLine();
            PersonMethods personMethods = addressMap.get(bookName);
            if (personMethods == null) {
                personMethods = new PersonMethods();
                addressMap.put(bookName, personMethods);
            }
                AddressBookMain book = new AddressBookMain();
                book.address_Book(personMethods);
                System.out.println("Press 1 : Want to enter in other address book\nOtherwise press any key");
                String choice = sc.nextLine();
                if (!choice.equals("1"))
                    break;
                else {
                    repeatProcedure();
                }
            System.out.println("do you want to exit from book?(1.No\n2.Yes");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
        } while (a ==1);
    }
}



