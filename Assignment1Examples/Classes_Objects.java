package com.correajulian.capgemini;

/**
 *
 * @author Julian
 */
public class Classes_Objects {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("John");
        e.setempid(2);
        
        Employee e2 = e;
        e2.setName("Richard");
        
        System.out.println(e.getName());//Should print Richard
    }
}
