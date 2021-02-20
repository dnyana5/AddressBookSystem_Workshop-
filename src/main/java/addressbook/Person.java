package addressbook;

import java.util.Scanner;

public class Person extends PersonMethods {
   private String firstname;
   private String lastname;
   private String address;
   private String city;
   private String state;
   private int zip;
   private String phone;
   private String email;
   private Scanner scanner = new Scanner(System.in);

       Person() {
         System.out.print("Enter First name:");
         setFirstname(scanner.next());
         System.out.print("Enter last name:");
         setLastname(scanner.next());
         System.out.print("Enter your address:");
         setAddress(scanner.next());
         System.out.print("Enter your city:");
         setCity(scanner.next());
         System.out.print("Enter your state:");
         setState(scanner.next());
         System.out.print("Enter your ZIP code:");
         setZip(scanner.nextInt());
         System.out.print("Enter your phone number:");
         setPhone(scanner.next());
         System.out.print("Enter your email:");
         setEmail(scanner.next());
     }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
