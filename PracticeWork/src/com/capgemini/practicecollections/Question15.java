package com.capgemini.practicecollections;

import java.util.*;
class KeyMaster {
public int i;
public KeyMaster(int i) { this.i = i; }
public boolean equals(Object o) { return i == ((KeyMaster)o).i; }
public int hashCode() { return i; }
}
public class Question15 {
public static void main(String[] args) {
	 Set<KeyMaster> set = new HashSet<KeyMaster>();
	 KeyMaster k1 = new KeyMaster(1);
	 KeyMaster k2 = new KeyMaster(2);
	 set.add(k1); set.add(k1);
	 set.add(k2); set.add(k2);
	 System.out.print(set.size() + ":");
	 k2.i = 1;
	 System.out.print(set.size() + ":");
	 set.remove(k1);
	 System.out.print(set.size() + ":");
	 set.remove(k2);
	 System.out.print(set.size());
 }
}
