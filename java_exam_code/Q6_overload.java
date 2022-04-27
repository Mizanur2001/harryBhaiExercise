//6. Define a class Shape and within the class define overloaded methods calculateArea to calculate the area of Circle and Square. Use BufferedReader for input.

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Shape{
    void calculateArea(float r){
        float area = 3.14f*r*r;
        System.out.println("Area of Circle is " + area);
    }

    void calculateArea(int s){
        int area = s*s;
        System.out.println("Area of Square is " + area);
    }
}

class Overload{
    public static void main(String []args){
        Shape sh = new Shape();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter The Value of Sizes");
            int s = Integer.parseInt(br.readLine());
            System.out.println("Enter the Value of Radious");
            float r = Float.parseFloat(br.readLine());
            sh.calculateArea(r);
            sh.calculateArea(s);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}