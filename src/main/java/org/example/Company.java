package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id,
                   String name,
                   double giro,
                   String[] developerNames) {

        this.id=id;
        this.name=name;
        setGiro(giro);
        this.developerNames=developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Error: Giro cannot be negative. Setting giro to 0.");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Error: Index out of bounds.");
        } else if (developerNames[index] != null) {
            System.out.println("Error: Index " + index + " is already occupied.");
        } else {
            developerNames[index] = name;
            System.out.println("Health plan " + name + " added at index " + index + ".");
        }
    }
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developerNames=" + String.join(", ", developerNames) + "}";
    }

}
