package edu.oakland.helper.problem3;

import edu.oakland.homework.problem3b.Building;
/*
  class Building {
   Building() {  
    	System.out.print("b ");  
   }//Building()
   Building(String name) {
      this(); //like super();   
      System.out.print("bn " + name);
   }//Building(String name)
  }//class Building
*/

  public class House extends Building {
   private House() {  
   	System.out.print("h ");  
   }//House()
   
   private House(String name) {
     this();   
     System.out.print("hn " + name);
   }//House(String name)
   
   public static void main(String[] args) { 
   	new House("x "); 
   }//main
  }//public class House extends Building