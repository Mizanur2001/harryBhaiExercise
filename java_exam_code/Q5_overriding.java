//5. Define an Abstract class Shape and its two Subclasses Square and Circle. Use method overriding to calculate the area of the square and circle.

abstract class Shape
  {
    abstract public double CalculateArea(int ra);
  }

class Circle extends Shape
  {
    @Override
    public double CalculateArea(int ra)
    {
      return 3.14 * ra * ra;
    }
  }

class Square extends Shape
  {
    @Override
    public double CalculateArea(int ra)
    {
      return  ra * ra;
    }
  }

class Override
  {
    public static void main(String args[])
      {
        Shape s = new Square();
        Shape c = new Circle();
        System.out.println("Squire: " + s.CalculateArea(10));
        System.out.println("Circle: " + c.CalculateArea(10));
      }
  }

