package edu.brcc.maxfieldj.ch10lab1;

/**
 * representation of a SailBoat
 * sub class of Boat
 * https://docs.google.com/document/d/1RAXToOEKUtgkjtRTBjBxYnxYU6ue_Un9PvwyrY8lfcs/edit?usp=sharing
 * 2021-09-05
 * @author john maxfield
 */
public class SailBoat extends Boat {
   private double sailArea;            // area of sail(s) in square feet

   /**
    * default/no-arg constructor
    * set numerics to 0
    */
   public SailBoat() {
      this(0,null,0,0,0);
   }

   /**
    * set all of the attributes
    * pass necessary args to super constructor
    * @param sailArea total area of sail(s) in square feet
    * @param name     name of the boat
    * @param loa      length of boat
    * @param beam     width of boat
    * @param maxCap   max weight of people and stuff
    */
   public SailBoat(double sailArea, String name, double loa, double beam, double maxCap) {
      super(name, loa, beam, maxCap);
      this.sailArea = sailArea;
   }

   /**
    * generated toString + super's toString
    * @return basic String representation of the SailBoat object
    */
   @Override
   public String toString() {
      return "SailBoat{" +
          "sailArea=" + sailArea +
          ", " + super.toString() +
          '}';
   }

   /**
    * exercise the class
    * @param args ignored
    */
   public static void main(String[] args) {
      // test by creating & printing a couple of objects
      System.out.println(new SailBoat());
      System.out.println(new SailBoat(45, "Patience", 11, 3.5, 250));
   }
}
