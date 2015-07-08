 package edu.oakland.helper.problem5;
 
 public class Dark {
   
 	 int x = 5;
   
 	 public static void main(String[] args) {
 	 	 new Dark().go1();
 	 }//main
   
 	 void go1() {
 	 	 //int x; //Don't need do to x is already defined
 	 	 go2(++x);
 	 }//void go1()
  
 	 void go2(int y) {
 	 	 int x = ++y;
 	 	 System.out.println(x);
 	 }//void go2(int y)
 }//public class Dark