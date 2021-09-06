package edu.brcc.maxfieldj.ch10lecture;

public class ColoredCircle extends Circle {
   private String color;        // the color of a circle. at present, can be any string

   public ColoredCircle() {
      super();
      //setColor("");
   }

   public ColoredCircle(String color) {
      super();
      this.setColor(color);
   }

   public ColoredCircle(double radius, String color) {
      super(radius);
      this.setColor(color);
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "ColoredCircle{" +
          "color='" + color + '\'' +
          "} " + super.toString();
   }

   public static void main(String[] args) {
      System.out.println(new ColoredCircle());
      System.out.println(new ColoredCircle("Red"));
      System.out.println(new ColoredCircle(5.7, "Blue"));
   }
}
