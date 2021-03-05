package com.company;
import org.springframework.data.annotation.Id;

@Entity
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private double fixedSalary;
    private double hourRate;
    private int hoursWorked;
    private float commRate;

    @Enumerated(EnumType.STRING)
    private EmployeeType emplType;

    public Employee(String firstName, String lastName, long id ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;

    }

    public abstract double gain();

    @Override
    public String toString(){
        return String.format( "%s %s ssn: %s", getFirstName(), getLastName(), getId());
    }

}
enum EmployeeType {

    SALARIED,
    HOURLY,
    COMMISION,
    SALARIED_COMMISION

}
