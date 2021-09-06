package edu.brcc.maxfieldj.ch10lab1;

/**
 * Base boat class known sub-classes: SailBoat, PowerBoat
 * https://docs.google.com/document/d/1RAXToOEKUtgkjtRTBjBxYnxYU6ue_Un9PvwyrY8lfcs/edit?usp=sharing
 * 2021-09-05
 * @author john maxfield
 */
public class Boat {
   private String name;              // name of boat
   private double lengthOverAll;     // length of boat
   private double beam;              // width of boat
   private double weightCapacity;    // max weight of people and stuff

   /**
    * default/no-arg constructor set numerics to 0 set Strings to empty String
    */
   public Boat() {
      name = "";
      lengthOverAll = 0.0;
      beam = 0.0;
      weightCapacity = 0.0;
   }

   /**
    * set all of the attributes
    * @param name           name of the boat
    * @param lengthOverAll  length of boat
    * @param beam           width of boat
    * @param weightCapacity max weight of people and stuff
    */
   public Boat(String name, double lengthOverAll, double beam, double weightCapacity) {
      this.name = name;
      this.lengthOverAll = lengthOverAll;
      this.beam = beam;
      this.weightCapacity = weightCapacity;
   }

   /**
    * standard getter for name optional for lab 10
    * @return name of boat
    */
   public String getName() {
      return name;
   }

   /**
    * standard getter for beam (width) optional for lab 10
    * @return beam (width) of boat
    */
   public double getBeam() {
      return beam;
   }

   /**
    * basic toString, show all attributes (generated automatically by IntelliJ)
    * @return basic String representation of the Boat object
    */
   @Override
   public String toString() {
      return "Boat{" +
          "name='" + name + '\'' +
          ", lengthOverAll=" + lengthOverAll +
          ", beam=" + beam +
          ", weightCapacity=" + weightCapacity +
          '}';
   }
}
