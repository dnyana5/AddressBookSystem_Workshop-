package com.controller;

import com.service.PersonMethods;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");

        int  input;
        int ans;
        PersonMethods personmethods = new PersonMethods();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add a contact\n2.Edit a contact\n3.Show contacts\n4.Delete contact\n");
            input = scanner.nextInt();
            switch(input)
            {
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
                default:System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue?\n1.yes\n2.no");
            ans = scanner.nextInt();
        }while(ans==1);
    }
}

