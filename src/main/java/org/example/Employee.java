package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id,String fullName,String email,String password,String[] healthplans) {
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthplans=healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getHealthPlans() {
        return healthplans;
    }

    public void setHealthPlans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Error: Index out of bounds.");
        } else if (healthplans[index] != null) {
            System.out.println("Error: Index " + index + " is already occupied.");
        } else {
            healthplans[index] = name;
            System.out.println("Health plan " + name + " added at index " + index + ".");
        }
    }

    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', password='" + password + "', healthplans=" + String.join(", ", healthplans) + "}";
    }
}
