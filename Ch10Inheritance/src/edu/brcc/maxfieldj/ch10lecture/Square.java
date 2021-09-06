package edu.brcc.maxfieldj.ch10lecture;

public class Square {
   private double side;       // length of any one side of the square

   public Square() {
   }

   public Square(double side) {
      this.setSide(side);
   }

   public double getSide() {
      return side;
   }

   public void setSide(double side) {
      if (side >= 0) {
         this.side = side;
      }
   }

   @Override
   public String toString() {
      return "Square{" +
          "side=" + side +
          '}';
   }

   public static void main(String[] args) {
      System.out.println(new Square());
      System.out.println(new Square(42));
   }
}
