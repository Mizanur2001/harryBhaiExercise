// 7. Define an interface Shape with abstract method calculatePerimeter. Implement the interface in two classes called Square and Circle. Create its objects to calculate perimeter.

interface Shape{
    final static float pi = 3.14f;
    float calculatePerimeter(float a);
}

class Circle implements Shape{
    public float calculatePerimeter(float a){
        return 2*pi*a;
    }
}

class Square implements Shape{
    public float calculatePerimeter(float a){
        return 4*a;
    }
}

class Interface{
    public static void main(String args[]){
        Circle cr = new Circle();
        System.out.println("Perimeter of Circle:"+cr.calculatePerimeter(4.0f));
        Square sq = new Square();
        System.out.println("Perimeter of Square:" +sq.calculatePerimeter(4.0f));
    }
}