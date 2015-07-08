  package edu.oakland.helper.pkgB; //edu.oakland.helper.pkgB  since it contains a main goes under helper 
  
  import edu.oakland.homework.pkgA.*;
  
  public class Baz {
    public static void main(String[] args) {
      Foo f = new Foo();
      System.out.print(" " + f.a);
      System.out.print(" " + f.b);
      System.out.println(" " + f.c);
   }
 }