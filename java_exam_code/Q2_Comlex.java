//2. Write a Java Program to create a class called Complex. Within the class define the relevant data variables as well as methods to sum and multiply two complex numbers. Create Complex class objects in main methods and perform summation and multiplication

import java.util.Scanner;
class Complex{
    int complex1Real,complex1Img,complex2Real,complex2Img;
    String sign = "+";
    Complex(int c1r ,int c1i ,int c2r ,int c2i){
        complex1Real = c1r;
        complex1Img = c1i;
        complex2Real = c2r;
        complex2Img = c2i;
    }
    public String sum(){
        int sumReal = complex1Real + complex2Real;
        int sumImg = complex1Img + complex2Img;
        if(sumImg<0){
            sign = "";
        }
        return sumReal + sign + sumImg + "i";
    }
    public String multi(){
        int sumReal = (complex1Real*complex2Real) - (complex1Img*complex2Img);
        int sumImg = (complex1Real*complex2Img) + (complex2Real*complex1Img);
        if(sumImg<0){
            sign = "";
        }
        return sumReal + sign + sumImg + "i";
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Complex Number :");
        System.out.println("Enter Real part:");
        int c1r = sc.nextInt();
        System.out.println("Enter Imaginary part:");
        int c1i = sc.nextInt();
        System.out.println("Enter the 2nd Complex Number :");
        System.out.println("Enter Real part:");
        int c2r = sc.nextInt();
        System.out.println("Enter Imaginary part:");
        int c2i = sc.nextInt();
        Complex com = new Complex(c1r,c1i,c2r,c2i);
        System.out.println("summation: "+com.sum());
        System.out.println("multiplication : "+com.multi());
    }
}