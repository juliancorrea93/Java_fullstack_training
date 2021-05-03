package access_mod_vis;

import com.correajulian.capgemini.Employee;//note import due to different package

/**
 * Part of problem 2 for access modifier visibility
 * @author Julian
 */
public class Manager extends Employee{
    public Manager() {
        super();
    }
    //Regional can access due to same package
    protected void sendOutEmails() {
        System.out.println("Emails sent from Manager");
    }
    //Regional cannot access this class as this is private
    private void talkWithRegional() {
        System.out.println("Regional's discussion is complete. from Manager");
    }
}
