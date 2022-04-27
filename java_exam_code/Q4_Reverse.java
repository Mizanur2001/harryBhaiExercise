//4. Write a Java Program to take a string input by using BufferedReader class object. Reverse this string and print it.

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Reverse{
    public static void main(String[] args){
        System.out.println("Enter a String : ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){;
        String str = br.readLine();
        String strRev = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            strRev = strRev + str.charAt(i);	
        }
        System.out.println(strRev);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}