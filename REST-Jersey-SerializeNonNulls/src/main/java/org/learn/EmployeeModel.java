package org.learn;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Employee")
public class EmployeeModel {
    public String firstName;
    public String lastName;
    public String contact;
    public int salary;
    public Date dob;
    public EmployeeModel() {} // JAXB needs this
 
    public EmployeeModel(String firstName, int salary, Date dob) {
        this.firstName = firstName;
        this.salary = salary;
        this.dob = dob;
    }
}