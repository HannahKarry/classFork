package edu.brcc.maxfieldj.ch10lab1;

/**
 * representation of a power boat
 * sub class of Boat
 * https://docs.google.com/document/d/1RAXToOEKUtgkjtRTBjBxYnxYU6ue_Un9PvwyrY8lfcs/edit?usp=sharing
 * 2021-09-05
 * @author john maxfield
 */
public class PowerBoat extends Boat {
   private double engineHP;       // horsepower rating of engine

   /**
    * default/no-arg constructor
    * set numerics to 0
    */
   public PowerBoat() {
      this(0,null,0,0,0);
   }

   /**
    * set all of the attributes
    * pass necessary args to super constructor
    * @param engineHP horsepower rating of engine
    * @param name     name of the boat
    * @param loa      length of boat
    * @param beam     width of boat
    * @param maxCap   max weight of people and stuff
    */
   public PowerBoat(double engineHP, String name, double loa, double beam, double maxCap) {
      super(name, loa, beam, maxCap);
      this.engineHP = engineHP;
   }

   @Override
   public String toString() {
      return "PowerBoat{" +
          "engineHP=" + engineHP +
          ", " + super.toString() +
          '}';
   }

   /**
    * exercise the class
    * @param args ignored
    */
   public static void main(String[] args) {
      // test by creating & printing a couple of objects
      System.out.println(new PowerBoat());
      System.out.println(new PowerBoat(10, "Fish King", 8, 4, 300));
   }
}
