abstract class Shape 
{    
    abstract double calculateArea();
}
class Circle extends Shape 
{
    double radius;
    Circle(double radius) 
    {
        this.radius = radius;
    }
    double calculateArea() 
    {
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape 
    {
    double length;
    double width;
    Rectangle(double length,double width) 
    {
        this.length = length;
        this.width = width;
    }
    double calculateArea() 
    {
        return length * width;
    }
}
class ShapeAreaCalculator 
{
    public static void main(String[] args) 
    {
        Circle c1 = new Circle(5.0);
        Rectangle r1 = new Rectangle(4.0, 6.0);
        System.out.println("Area of the Circle: " + c1.calculateArea());
        System.out.println("Area of the Rectangle: " + r1.calculateArea());
    }
}