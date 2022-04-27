// 1.	Write Java Program to print all the Prime numbers in a range given by the user. Take input through BufferedReader class object.

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Prime{
    public static boolean isPrime(int num){
        for(int i = 2 ; i <= num/2 ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        try(BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enetr Min Range = ");
            int min = Integer.parseInt(sc.readLine());
            System.out.print("Enetr Max Range = ");
            int max = Integer.parseInt(sc.readLine());
            if(min>max){
                System.out.println("Invalid Input min is grater than Max");
            }
            for(int i=min; i<=max; i++){
                if(i!=0){
                    if(i!=1){
                        if(isPrime(i)){
                        System.out.println(i);
                        }
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}