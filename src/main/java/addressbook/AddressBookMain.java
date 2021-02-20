package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBookMain {
    void address_Book(PersonMethods personMethods) {

        while (true) {
            System.out.println("1.Add a contact\n2.Edit a contact\n3.Show contacts\n4.Delete contact\n0.Exit");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    personMethods.add();
                    break;
                case 2:
                    personMethods.edit();
                    break;
                case 3:
                    personMethods.show();
                    break;
                case 4:
                    personMethods.delete();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Map<String, PersonMethods> addressMap = new HashMap<String,PersonMethods>();
        String bookName;
        while (true) {
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
        }
            Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1: Search By city");
            System.out.println("Press 2: Search By state");
            System.out.println("Press 0: Exit");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Enter city for search");
                    String City = scanner.next();
                    System.out.println("Enter first name");
                    String first_Name = scanner.next();
                    System.out.println("Enter last name");
                    String last_Name = scanner.next();
                    SearchCity(addressMap, City, first_Name, last_Name);
                    break;
                case 2:
                    System.out.println("Enter state for search");
                    String State = scanner.next();
                    System.out.println("Enter first name");
                    String First_Name = scanner.next();
                    System.out.println("Enter last name");
                    String Last_Name = scanner.next();
                    SearchState(addressMap, State, First_Name, Last_Name);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please Enter Correct choice ");
            }
        }
    }

    static void SearchCity(Map<String, PersonMethods> addressMap, String City, String first_name, String last_name)
    {
            for (PersonMethods iterator : addressMap.values()) {
                Set<Person> addressBooks = iterator.newBooks;
                addressBooks.stream().forEach(addressBook -> {
                if (addressBook.getCity().equalsIgnoreCase(City))
                    if (addressBook.getFirstname().equalsIgnoreCase(first_name))
                        if (addressBook.getLastname().equalsIgnoreCase(last_name))
                            System.out.println(addressBook.getFirstname() + " " + addressBook.getLastname());

            });
            System.out.println("No person of name " + first_name + " " + last_name + " is present in "+City);
        }
    }

    static void SearchState(Map<String, PersonMethods> addressMap, String State, String first_name,
                            String lastName) {
        for (PersonMethods iterator : addressMap.values()) {
            Set<Person> addressBooks = iterator.newBooks;
            addressBooks.stream().forEach(addressBook -> {
                if (addressBook.getFirstname().equalsIgnoreCase(State))
                    if (addressBook.getFirstname().equalsIgnoreCase(first_name))
                        if (addressBook.getLastname().equalsIgnoreCase(lastName))
                            System.out.println(addressBook.getFirstname() + " " + addressBook.getFirstname());
            });
            System.out.println("No person of name " + first_name + " " + lastName + " is present in "+State);
        }
    }
}




