/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access_mod_vis;

/**
 *
 * @author Julian
 */
public class BakedGood {
    public BakedGood(String label, int internal) {
        name = label;
        internal_temp = internal;
    }
    
    void raiseTmp() {
        internal_temp += 15;
        System.out.println("Internal temperature raised by 15 to " + internal_temp + " within Baked Good class");
    }
    
    private String name;
    protected int internal_temp;
}
