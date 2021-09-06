package edu.brcc.maxfieldj.ch10lab1;

/**
 * exercise the Boat class and subclasses
 * https://docs.google.com/document/d/1RAXToOEKUtgkjtRTBjBxYnxYU6ue_Un9PvwyrY8lfcs/edit?usp=sharing
 * 2021-09-05
 * @author john maxfield
 */
public class BoatMain {
   public static void main(String[] args) {
      // create one object of each class
      Boat      boat = new Boat("canoe", 14, 2.5, 250);
      SailBoat  sb   = new SailBoat(45, "Patience", 11, 3.5, 250);
      PowerBoat pb   = new PowerBoat(10, "Fish King", 8, 4, 300);

      // print them
      System.out.println(boat);
      System.out.println(sb);
      System.out.println(pb);
   }
}
