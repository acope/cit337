 package edu.oakland.helper.problem4;
 
 public class Ouch {
   
 	 static int ouch = 7;
    
 	 public static void main(String[] args) {
 	 	 new Ouch().go(ouch);
 	 	 System.out.print(" " + ouch);
     }//main
    
     void go(int ouch) {     
     	 ouch++; 
     	 /*
     	 replaced ouch with i, need to replace? 
     	 ouch caused an error: variable ouch is already defined in method go(int)
     	 not sure if this was intended to increase ouch more than once
     	 generally i is used for iteration(for loops)
     	 
     	 */
     	 for(int i = 3; i < 6; i++); 
     	 System.out.print(" " + ouch);
     }//void go(int ouch)
 }