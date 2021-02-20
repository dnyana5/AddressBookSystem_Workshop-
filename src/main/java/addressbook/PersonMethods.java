package addressbook;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class PersonMethods {
    //ArrayList<Person> newBooks = new ArrayList<>();
    Set<Person> newBooks = new LinkedHashSet<Person>();

     void add() {

        boolean flag = true;
        Person person = new Person();
        for (Person iterator : newBooks) {
            if (iterator.getFirstname().equalsIgnoreCase(person.getFirstname()))
                flag = false;
        }
        if (flag)
            newBooks.add(person);

    }

    void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name whose details need to change  ");
        String name = scanner.nextLine();
        System.out.println("Enter the detail you have to edit");
        while (true) {
            System.out.println("Press 1 : Address\n\"Press 2 : City\nPress 3 : State\nPress 4 : Zip\nPress 5 : Phone Number\nPress 0 : Exit\"");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Address Name");
                    String Addresss = scanner.next();
                    for (Person iterator : newBooks) {
                        if (iterator.getFirstname().equalsIgnoreCase(name))
                            iterator.setAddress(Addresss);
                    }
                    break;
                case 2:
                    System.out.println("Enter the new City");
                    String City = scanner.next();
                    for (Person iterator : newBooks) {
                        if (iterator.getFirstname().equalsIgnoreCase(name))
                            iterator.setCity(City);
                    }
                    break;
                case 3:
                    System.out.println("Enter the new State");
                    String State = scanner.next();
                    for (Person iterator : newBooks) {
                        if (iterator.getFirstname().equalsIgnoreCase(name))
                            iterator.setState(State);
                    }
                    break;
                case 4:
                    System.out.println("Enter the new Zip");
                    int zip = scanner.nextInt();
                    for (Person iterator : newBooks) {
                        if (iterator.getFirstname().equalsIgnoreCase(name))
                            iterator.setZip(zip);
                    }
                    break;
                case 5:
                    System.out.println("Enter the new Phone Number");
                    String Phone_Number = scanner.next();
                    for (Person iterator : newBooks) {
                        if (iterator.getFirstname().equalsIgnoreCase(name))
                            iterator.setPhone(Phone_Number);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please Enter Correct Option");
            }
        }
    }

     void show() {
         Iterator itr = newBooks.iterator();
         while (itr.hasNext()) {
            Person person = (Person) itr.next();
            System.out.println("************************");
            System.out.println("Name- " + person.getFirstname() + " " + person.getLastname() +
                    "\nAddress- " + person.getAddress() + "\nCity- " + person.getCity() +
                    "\nState- " + person.getState() + "\nZip- " + person.getZip() +
                    "\nPhone Number- " + person.getPhone() + "\nEmail - " + person.getEmail());
        }
    }

    void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name whose data to delete");
        String name = scanner.nextLine();
        for (Person iterator : newBooks) {
            if (iterator.getFirstname().equalsIgnoreCase(name))
                newBooks.remove(iterator);

            System.out.println("contact deleted!!");
        }
    }

   }
