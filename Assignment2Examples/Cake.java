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
public class Cake extends BakedGood{
    public Cake () {
        super("Chocolate Cake", 275);
        
    }
    @Override
    public void raiseTmp() {
        this.internal_temp += 10;
        System.out.println("internal temperature increase by  10 to " + this.internal_temp +"by Cake class");
        
        super.raiseTmp();
        System.out.println(this.internal_temp);
    }
    
    public static void main(String[] args) {
        Cake c = new Cake();
        
        c.raiseTmp();
    }
}
