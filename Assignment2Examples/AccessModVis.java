/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access_mod_vis;

import com.correajulian.capgemini.Employee;

/**
 *
 * @author Julian
 */
public class AccessModVis {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Johnny");
        e.setempid(2);
        Manager m = new Manager();
        
        //e.talkWithManager(); protected Can't access diff class diff package
        //e.takeLunch(); default diff class diff package can't access
        System.out.println("Employee method");
        e.attendMeetings(); //public method can be accessed anywhere
        
        System.out.println("Displays inherited methods Manager");
        
        m.attendMeetings();
        m.setName("Lonny");
        m.setempid(1);
        
        m.sendOutEmails();
        
        //
        Regional r = new Regional();
        System.out.println("attend meetings method from employee");
        r.attendMeetings();
        System.out.println("methods able to be accessed by Regional via Employee Inheritance from inherited Manager class");
        r.setName("Udonis");
        r.setempid(3);
        System.out.println(r.getName());
        System.out.println("Method inherited from Manager");
        r.sendOutEmails();
    }
}
