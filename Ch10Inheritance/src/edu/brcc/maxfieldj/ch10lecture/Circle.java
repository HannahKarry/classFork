package edu.brcc.maxfieldj.ch10lecture;

public class Circle {
   private double radius;      // the radius of a circle

   public Circle() {
      this(0);
   }

   public Circle(double radius) {
      this.setRadius(radius);
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      if (radius >= 0) {
         this.radius = radius;
      }
   }

   @Override
   public String toString() {
      return "Circle{" +
          "radius=" + radius +
          '}';
   }

   public static void main(String[] args) {
      System.out.println(new Circle());
      System.out.println(new Circle(1.7));
   }
}
