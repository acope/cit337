  package edu.oakland.homework.problem3b;
  
  public class Building {
   protected Building() {  
    	System.out.print("b ");  
   }//Building()
   protected Building(String name) {
      this();   
      System.out.print("bn " + name);
   }//Building(String name)
  }//class Building