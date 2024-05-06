package assignment2.organizations.insurance;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.commons.Person;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany extends Organization implements Contactable {
    private String email;
    private String address;
    private String phoneNumber;
    private List<Customer> customers;

    public InsuranceCompany(String name, String description) {
        super.setName(name);
        super.setDescription(description);
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean removeCustomer(Customer customer) {
        return customers.remove(customer);
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}