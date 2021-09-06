package edu.brcc.maxfieldj.ch10lecture;

public class ShapesDemo {
   public static void main(String[] args) {
      System.out.println(new Circle());
      System.out.println(new Circle(1.7));
      System.out.println(new ColoredCircle());
      System.out.println(new ColoredCircle("Red"));
      System.out.println(new ColoredCircle(5.7, "Blue"));
      System.out.println(new Square());
      System.out.println(new Square(42));
   }
}
