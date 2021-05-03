package com.correajulian.capgemini;

/**
 *Part of problem 2 for access modifier visibility, and class objects example
 * @author Julian
 */
public class Employee {
    private int empId;
    private String name;
    
    public void setName(String emp_name) {
        name = emp_name;
    }
    public void setempid(int emp_id) {
        empId = emp_id;
    }
    public String getName() {
        return name;
    }
    public int getempid() {
        return empId;
    }
    //Regional and Manager classes cannot access this as they are in a different package
    void takeLunch() {
        System.out.println("Employee has taken lunch");
    }
    public void attendMeetings() {
        System.out.println("Meetings attended from employee method");
    }
    //Regional and Manager classes cannot access this as they are in a different package
    protected void talkWithManager() {
        System.out.println("Manager spoken to, employee method");
    }
}
